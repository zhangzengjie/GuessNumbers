package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class AnswerTest {
    @Test
    public void should_return_4A0B_given_compare_1234_to_answer_1234(){
        //given
        Answer answer = new Answer("1 2 3 4");
        //when
        String result = answer.check("1 2 3 4");
        //then
        Assert.assertEquals("4A0B",result);

    }
    @Test
    public void should_return_2A0B_given_compare_1256_to_answer_1234(){
        //given
        Answer answer = new Answer("1 2 3 4");
        //when
        String result = answer.check("1 2 5 6");
        //then
        Assert.assertEquals("2A0B",result);

    }
    @Test
    public void should_return_1A3B_given_compare_1423_to_answer_1234(){
        //given
        Answer answer = new Answer("1 2 3 4");
        //when
        String result = answer.check("1 4 2 3");
        //then
        Assert.assertEquals("1A3B",result);

    }
    @Test
    public void should_return_0A4B_given_compare_4123_to_answer_1234(){
        //given
        Answer answer = new Answer("1 2 3 4");
        //when
        String result = answer.check("4 1 2 3");
        //then
        Assert.assertEquals("0A4B",result);

    }
    @Test
    public void should_return_0A2B_given_compare_7823_to_answer_1234(){
        //given
        Answer answer = new Answer("1 2 3 4");
        //when
        String result = answer.check("7 8 2 3");
        //then
        Assert.assertEquals("0A2B",result);

    }
    @Test
    public void should_return_0A0B_given_compare_7809_to_answer_1234(){
        //given
        Answer answer = new Answer("1 2 3 4");
        //when
        String result = answer.check("7 8 0 9");
        //then
        Assert.assertEquals("0A0B",result);

    }

}
