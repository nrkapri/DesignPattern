package com.java.designpattern.creational.builder;


public class BuilderDesignPatternTester
{

    public static void main(String[] args)
    {
       CarBuilder cb= new CarBuilderImpl();
       CarBuildDirector cbd= new CarBuildDirector(cb);
       
       Car car = cbd.builaCar();
       
       System.out.println(car.toString());
    }

}

