package com.java.designpattern.decorator;


public abstract class FoodDecorator implements Food
{
Food newFood;


 public  FoodDecorator(Food f)
 {
     newFood=f;
 }
    
 
  public void prepareFood() {
      newFood.prepareFood();
      System.out.print(" + ");
  }
 
 public int price() {
     return newFood.price();
 }
    
}

