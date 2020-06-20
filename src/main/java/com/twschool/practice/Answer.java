package com.twschool.practice;

import java.util.Arrays;
import java.util.List;

public class Answer {

    private final List<String> gameAnswerNumbers;

    public Answer(String gameAnswerString) {
        this.gameAnswerNumbers = Arrays.asList(gameAnswerString.split(" "));
    }
    public String check(String userAnswerString) {
        List<String> userAnswerNumbers = Arrays.asList(userAnswerString.split(" "));
        int valueACorrectCount = 0;
        int valueBCorrectCount = 0;
        for (int index = 0; index < userAnswerNumbers.size();index++){
            if (userAnswerNumbers.get(index).equals(gameAnswerNumbers.get(index))){
                valueACorrectCount ++;
            }
            else if (gameAnswerNumbers.contains(userAnswerNumbers.get(index))){
                valueBCorrectCount ++;
            }
        }
        String result = valueACorrectCount+"A"+valueBCorrectCount+"B";
        return result;
    }

}
