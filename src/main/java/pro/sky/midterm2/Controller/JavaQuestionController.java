package pro.sky.midterm2.Controller;

import pro.sky.midterm2.Question;
import pro.sky.midterm2.Service.QuestionService;

import java.util.Collection;

public class JavaQuestionController {
    QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }


    public Question addQuestion(String question, String answer) {
        return service.add(question, answer);
    }

    public Collection<Question> getQuestions() {
        return service.getAll();
    }

    public Question removeQuestion(String question) {
        return service.remove(question);
    }
}
