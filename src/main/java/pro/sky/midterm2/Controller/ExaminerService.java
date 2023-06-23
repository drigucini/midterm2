package pro.sky.midterm2.Controller;

import pro.sky.midterm2.Controller.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
