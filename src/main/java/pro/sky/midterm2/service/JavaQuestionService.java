package pro.sky.midterm2.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import pro.sky.midterm2.controller.Question;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    Set<Question> questions = new HashSet<>();

    @PostConstruct
    public void initQuestions() {
        questions.add(new Question("a?", "b"));
        questions.add(new Question("you?", "me"));
        questions.add(new Question("wefs?", "asdx"));
        questions.add(new Question("what?", "byes"));
        questions.add(new Question("how?", "knowhow"));
    }
    public Question add(String question, String answer) {
        Question questionToAdd = new Question(question, answer);
        questions.add(questionToAdd);
        return questionToAdd;
    }

    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    public Collection<Question> getAll() {
        return new HashSet<>(questions);
    }

    public Question getRandomQuestion() {
        int randomIndex = new Random().nextInt(questions.size());
        return (new ArrayList<>(questions)).get(randomIndex);
    }

}
