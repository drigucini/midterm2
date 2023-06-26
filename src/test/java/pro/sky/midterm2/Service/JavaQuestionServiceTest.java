package pro.sky.midterm2.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.midterm2.Controller.Question;

import java.util.Collection;

public class JavaQuestionServiceTest {

    private final QuestionService questionService = new JavaQuestionService();

    @Test
    public void shouldCorrectlyAddQuestion() {
        //given
        Question question = new Question("How is it?", "Gpood");

        //when
        Question addedQuestion = questionService.add(question);

        //then
        Assertions.assertEquals(question, addedQuestion);
    }

    @Test
    public void shouldCorrectlyRemoveQuestion() {
        //given
        Question question = new Question("How is it?", "Gpood");
        Question addedQuestion = questionService.add(question);

        //when and then
        Assertions.assertEquals(question, questionService.remove(addedQuestion));
    }

    @Test
    public void shouldReturnAllExistingQuestions() {
        //given
        Question question = new Question("How is it?", "Gpood");
        Question addedQuestion = questionService.add(question);

        //when
        Collection<Question> all = questionService.getAll();

        // then
        Assertions.assertEquals(all.size(), 1);
    }
}

