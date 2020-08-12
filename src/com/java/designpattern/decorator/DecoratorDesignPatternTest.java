package com.java.designpattern.decorator;


public class DecoratorDesignPatternTest
{

    public static void main(String[] args)
    {

        Food meal = new BasicFood();
        
        Food chickenMeal=  new ChickenTikka(meal);
        
        Food chickenMealWithDesert = new Desert(chickenMeal);
        
        chickenMealWithDesert.prepareFood();
        System.out.println();
        System.out.print(chickenMealWithDesert.price());

    }

}

