package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;
import sun.security.x509.OtherName;

public class GuessNumberGameTest {
    @Test
    public void should_return_2A0B_given_guess_answer_1256(){
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new Answer("1 2 3 4"));
        //when
        String result = guessNumberGame.guess("1 2 5 6");
        //then
        Assert.assertEquals("2A0B",result);
    }
    @Test
    public void should_return_status_SUCCEED_given_1234(){
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new Answer("1 2 3 4"));
        //when
        guessNumberGame.guess("1 2 3 4");
        GameStatus gameStatus = guessNumberGame.getStatus();

        //then
        Assert.assertEquals(GameStatus.SUCCEED,gameStatus);
    }
    @Test
    public void should_return_status_SUCCEED_given_4567_1256_1234(){
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new Answer("1 2 3 4"));
        //when
        guessNumberGame.guess("4 5 6 7");
        guessNumberGame.guess("1 2 5 6");
        guessNumberGame.guess("1 2 3 4");
        GameStatus gameStatus1 = guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.SUCCEED,gameStatus1);
    }
    @Test
    public void should_return_status_CONTINUED_given_1256(){
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new Answer("1 2 3 4"));
        //when
        guessNumberGame.guess("1 2 5 6");
        GameStatus gameStatus = guessNumberGame.getStatus();

        //then
        Assert.assertEquals(GameStatus.CONTINUED,gameStatus);
    }
    @Test
    public void should_return_status_CONTINUED_given_3467_2345_1235_4567_1237(){
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new Answer("1 2 3 4"));
        //when
        guessNumberGame.guess("3 4 6 7");
        guessNumberGame.guess("2 3 4 5");
        guessNumberGame.guess("1 2 3 5");
        guessNumberGame.guess("4 5 6 7");
        guessNumberGame.guess("1 2 3 7");
        GameStatus gameStatus = guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.CONTINUED,gameStatus);

    }
    @Test
    public void should_return_status_FAILED_given_3467_2345_1235_4567_1237_3456(){
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new Answer("1 2 3 4"));
        //when
        guessNumberGame.guess("3 4 6 7");
        guessNumberGame.guess("2 3 4 5");
        guessNumberGame.guess("1 2 3 5");
        guessNumberGame.guess("4 5 6 7");
        guessNumberGame.guess("1 2 3 7");
        guessNumberGame.guess("3 4 5 6");
        GameStatus gameStatus = guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.FAILED,gameStatus);

    }

}
