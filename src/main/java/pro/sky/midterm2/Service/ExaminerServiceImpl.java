package pro.sky.midterm2.Service;

import pro.sky.midterm2.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ExaminerServiceImpl implements ExaminerService {
    Random random;
    QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    public Collection<Question> getQuestions(int amount) {
        Set<Question> questionsPull = new HashSet<>();

        while (questionsPull.size() < amount) {
            Question randomQuestion = questionService.getRandomQuestion();
            questionsPull.add(randomQuestion);
        }

        return questionsPull;
    }
}
