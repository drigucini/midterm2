package pro.sky.midterm2.Service;

import pro.sky.midterm2.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class ExaminerServiceImpl implements ExaminerService {
    Random random;
    QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    public Collection<Question> getQuestions(int amount) {
        Collection<Question> questionsPull = new HashSet<>();
        questionService.getRandomQuestion();
        return null;
    }
}
