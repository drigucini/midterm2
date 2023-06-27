package pro.sky.midterm2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.midterm2.controller.Question;

import java.util.*;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    private QuestionService questionService;

    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @Test
    public void shouldCollectRandomQuestions() {
        //given
        int amount = 3;
        Set<Question> questions = new HashSet<>();
        questions.add(new Question("a?", "b"));
        questions.add(new Question("you?", "me"));
        questions.add(new Question("wefs?", "asdx"));
        questions.add(new Question("what?", "byes"));
        questions.add(new Question("how?", "know how"));
        List<Question> questionsList = new ArrayList<>(questions);

        given(questionService.getAll()).willReturn(questions);
        given(questionService.getRandomQuestion()).willReturn(
                questionsList.get(0),
                questionsList.get(0),
                questionsList.get(0),
                questionsList.get(1),
                questionsList.get(1),
                questionsList.get(2),
                questionsList.get(2)
        );


        //when
        Collection<Question> actualRandomQuestions = examinerService.getQuestions(amount);

        //then
        Assertions.assertEquals(new HashSet<>(List.of(questionsList.get(0), questionsList.get(1), questionsList.get(2))), actualRandomQuestions);
    }
}
