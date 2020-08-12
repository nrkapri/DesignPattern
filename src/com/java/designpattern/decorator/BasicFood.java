package com.java.designpattern.decorator;


public class BasicFood implements Food
{

    @Override
    public void prepareFood()
    {
      System.out.print("Basic Food");
    }

    @Override
    public int price()
    {
        return 50;

    }

}

