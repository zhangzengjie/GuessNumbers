package com.twschool.practice;

public class MarsRover {
    private MarsRoverPostion marsRoverPostion;
    public MarsRover(MarsRoverPostion marsRoverPostion) {
        this.marsRoverPostion=marsRoverPostion;
    }

    public MarsRoverPostion receive(String command) {
        Direction tempDirection =  marsRoverPostion.getDirection();
        int tempCoorX =  marsRoverPostion.getCoordinatesX();
        int tempCoorY = marsRoverPostion.getCoordinatesY();

        if ("L".equals(command)) {
            tempDirection.leftDirection();
            if ("N".equals(tempDirection)) {
                tempDirection.leftDirection();
            } else if("E".equals(tempDirection)){
                tempDirection.leftDirection();
            } else if("S".equals(tempDirection)) {
                tempDirection.leftDirection();
            } else if ("W".equals(tempDirection)) {
                tempDirection.leftDirection();
            }
        }



        if ("M".equals(command)) {
            marsRoverPostion.move();

        }

        if ("R".equals(command)) {
            if ("N".equals(tempDirection)) {
               tempDirection.rightDirection();
            } else if ("E".equals(tempDirection)) {
                tempDirection.rightDirection();
            } else if ("S".equals(tempDirection)) {
                tempDirection.rightDirection();
            } else if ("W".equals(tempDirection)) {
                tempDirection.rightDirection();
            }
        }


        return  marsRoverPostion;
    }
}
