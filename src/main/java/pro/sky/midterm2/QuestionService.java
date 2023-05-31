package pro.sky.midterm2;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question add(String question);

    Question remove(String question);

    Collection<Question> getAll();

    Question getRandomQuestion();


}
