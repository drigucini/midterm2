package pro.sky.midterm2.controller;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
