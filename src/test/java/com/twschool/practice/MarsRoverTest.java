package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static com.twschool.practice.Direction.*;

public class MarsRoverTest {

    @Test
    public void return_X0_Y0_direction_S_when_give_X0_Y0_W_command_L(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,W);
        MarsRover marsRover = new MarsRover(marsRoverPostion);
        //when
        MarsRoverPostion result = marsRover.receive("L");
        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("S",result.getDirection());
    }

    @Test
    public void return_X0_Y0_direction_S_when_give_X0_Y0_W_command_R(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,W);
        MarsRover marsRover = new MarsRover(marsRoverPostion);
        //when
        MarsRoverPostion result = marsRover.receive("R");
        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("N",result.getDirection());
    }

    @Test
    public void return_X0_Y0_direction_S_when_give_X0_Y0_S_command_M(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,S);
        MarsRover marsRover = new MarsRover(marsRoverPostion);
        //when
        MarsRoverPostion result = marsRover.receive("M");
        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(-1,result.getCoordinatesY());
        Assert.assertEquals("S",result.getDirection());
    }

    @Test
    public void return_X0_Y0_direction_E_when_give_X0_Y0_S_command_L(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,S);
        MarsRover marsRover = new MarsRover(marsRoverPostion);
        //when
        MarsRoverPostion result = marsRover.receive("L");
        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("E",result.getDirection());
    }

    @Test
    public void return_X0_Y0_direction_N_when_give_X0_Y0_N_command_M(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,N);
        MarsRover marsRover = new MarsRover(marsRoverPostion);
        //when
        MarsRoverPostion result = marsRover.receive("M");
        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(1,result.getCoordinatesY());
        Assert.assertEquals("N",result.getDirection());

    }

    @Test
    public void return_X0_Y0_direction_W_when_give_X0_Y0_N_command_L(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,N);
        MarsRover marsRover = new MarsRover(marsRoverPostion);
        //when
        MarsRoverPostion result = marsRover.receive("L");
        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("W",result.getDirection());
    }

    @Test
    public void return_X0_Y0_direction_E_when_give_X0_Y0_N_command_R(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,N);
        MarsRover marsRover = new MarsRover(marsRoverPostion);
        //when
        MarsRoverPostion result = marsRover.receive("R");
        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("E",result.getDirection());
    }

    @Test
    public void return_X0_Y0_direction_W_when_give_X0_Y0_W_command_M(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,W);
        MarsRover marsRover = new MarsRover(marsRoverPostion);
        //when
        MarsRoverPostion result = marsRover.receive("M");
        //then
        Assert.assertEquals(-1,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("W",result.getDirection());
    }


    @Test
    public void return_X0_Y0_direction_W_when_give_X0_Y0_S_command_R(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,S);
        MarsRover marsRover = new MarsRover(marsRoverPostion);
        //when
        MarsRoverPostion result = marsRover.receive("R");
        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("W",result.getDirection());
    }

    @Test
    public void return_X0_Y0_direction_E_when_give_X0_Y0_E_command_M(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,E);
        MarsRover marsRover = new MarsRover(marsRoverPostion);
        //when
        MarsRoverPostion result = marsRover.receive("M");
        //then
        Assert.assertEquals(1,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("E",result.getDirection());
    }

    @Test
    public void return_X0_Y0_direction_E_when_give_X0_Y0_E_command_L(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,E);
        MarsRover marsRover = new MarsRover(marsRoverPostion);
        //when
        MarsRoverPostion result = marsRover.receive("L");
        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("N",result.getDirection());
    }

    @Test
    public void return_X0_Y0_direction_E_when_give_X0_Y0_E_command_R(){
        //given
        MarsRoverPostion marsRoverPostion = new MarsRoverPostion(0,0,E);
        MarsRover marsRover = new MarsRover(marsRoverPostion);
        //when
        MarsRoverPostion result = marsRover.receive("R");
        //then
        Assert.assertEquals(0,result.getCoordinatesX());
        Assert.assertEquals(0,result.getCoordinatesY());
        Assert.assertEquals("S",result.getDirection());
    }
}

