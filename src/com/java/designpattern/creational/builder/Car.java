package com.java.designpattern.creational.builder;


public class Car
{
    int wheels ;
    String color;
    
    public int getWheels()
    {
        return wheels;
    }
    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    @Override
    public String toString()
    {
        return "Car [wheels=" + wheels + ", color=" + color + "]";
    }
  
    
    

}

