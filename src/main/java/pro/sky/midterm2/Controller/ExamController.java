package pro.sky.midterm2.Controller;

import pro.sky.midterm2.Question;
import pro.sky.midterm2.Service.ExaminerService;

import java.util.Collection;

public class ExamController {
    ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    public Collection<Question> getQuestions(int amount) {
        return examinerService.getQuestions(amount);
    }
}
