package com.twschool.practice;

public class GuessNumberGame {
    private static final int MAX_TRY_TIMES = 6;
    private Answer answer;
    private GameStatus gameStatus = GameStatus.FAILED;
    private int leftTryTimes = MAX_TRY_TIMES;

    public GuessNumberGame(Answer answer) {
        this.answer = answer;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }


    public String guess(String userAnswerString) {
        String result = answer.check(userAnswerString);
        leftTryTimes --;
        modifyStatus(result);
        return result;
    }

    public void modifyStatus(String result) {
        if ("4A0B".equals(result)){
            gameStatus = GameStatus.SUCCEED;
        } else if (leftTryTimes > 0){
            gameStatus = GameStatus.CONTINUED;
        }else{
            gameStatus = GameStatus.FAILED;
        }
    }
    public GameStatus getStatus() {
        return gameStatus;
    }
}
