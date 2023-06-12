package pro.sky.midterm2.Service;

import org.springframework.stereotype.Service;
import pro.sky.midterm2.Question;

import java.util.Collection;
import java.util.Random;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {
    Set<Question> questions;
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
        return questions;
    }

    public Question getRandomQuestion() {
        int item = new Random().nextInt(questions.size());
        int i = 0;
        for (Question question : questions) {
            if(i == item){
                return question;
            }
            i++;
        }
        return null;

    }

}
