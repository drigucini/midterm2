package pro.sky.midterm2.service;

import org.springframework.stereotype.Service;
import pro.sky.midterm2.controller.ExaminerService;
import pro.sky.midterm2.controller.Question;
import pro.sky.midterm2.exception.NotEnoughQuestionsInStorageException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    Random random;
    QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    public Collection<Question> getQuestions(int amount) {
        int size = questionService.getAll().size();
        if (amount > size) {
            throw new NotEnoughQuestionsInStorageException();
        }

        Set<Question> questionsPull = new HashSet<>();

        while (questionsPull.size() < amount) {
            Question randomQuestion = questionService.getRandomQuestion();
            questionsPull.add(randomQuestion);
        }

        return questionsPull;
    }
}
