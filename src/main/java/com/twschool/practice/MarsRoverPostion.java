package com.twschool.practice;

import static com.twschool.practice.Direction.*;

public class MarsRoverPostion {

    private int coordinatesX;
    private int coordinatesY;
    private Direction direction;

    public MarsRoverPostion(int coordinatesX, int coordinatesY, Direction direction) {
        this.coordinatesX=coordinatesX;
        this.coordinatesY = coordinatesY;
        this.direction = direction;
    }

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {
        if(W.equals(direction)) {
            setCoordinatesX(coordinatesX--);
        } else if (N.equals(direction)) {
            setCoordinatesY(coordinatesY++);
        } else if (E.equals(direction)) {
            setCoordinatesX(coordinatesX++);
        } else if (S.equals(direction)) {
            setCoordinatesY(coordinatesY--);
        }
    }
}
