package com.java.designpattern.creational.builder;


public interface CarBuilder
{

    public Car build ();
    
    CarBuilder designColor(String color);
    CarBuilder addWheels(int wheels);
    
}

