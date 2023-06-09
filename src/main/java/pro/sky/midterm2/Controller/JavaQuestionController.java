package pro.sky.midterm2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.midterm2.Question;
import pro.sky.midterm2.Service.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping(path = "/add")
    public Question addQuestion(String question, String answer) {
        return service.add(question, answer);
    }

    @GetMapping(path = "")
    public Collection<Question> getQuestions() {
        return service.getAll();
    }

    @GetMapping(path = "/remove")
    public Question removeQuestion(Question question) {
        return service.remove(question);
    }
}
