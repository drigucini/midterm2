package pro.sky.midterm2.Service;

import org.springframework.stereotype.Service;
import pro.sky.midterm2.Question;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    Set<Question> questions = new HashSet<>();
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
