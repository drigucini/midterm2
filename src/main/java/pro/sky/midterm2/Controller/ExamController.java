package pro.sky.midterm2.Controller;

import org.springframework.web.bind.annotation.RestController;
import pro.sky.midterm2.Question;
import pro.sky.midterm2.Service.ExaminerService;

import java.util.Collection;

@RestController
public class ExamController {
    ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    public Collection<Question> getQuestions(int amount) {
        return examinerService.getQuestions(amount);
    }
}
