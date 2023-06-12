package pro.sky.midterm2.Service;

import pro.sky.midterm2.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
