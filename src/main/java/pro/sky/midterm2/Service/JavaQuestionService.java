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
        return null;
    }

    public Question add(String question) {
        return null;
    }

    public Question remove(String question) {
        return null;
    }

    public Collection<Question> getAll() {
        return null;
    }

    public Question getRandomQuestions() {
        int number = 0;
        int random = new Random().nextInt(number);
        return null;
    }

}
