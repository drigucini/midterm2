package pro.sky.midterm2.Service;

import pro.sky.midterm2.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(String question, String answer);

    Question add(String question);

    Question remove(String question);

    Collection<Question> getAll();

    Question getRandomQuestions();


}
