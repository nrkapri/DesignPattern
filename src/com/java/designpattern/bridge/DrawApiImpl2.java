package com.java.designpattern.bridge;


public class DrawApiImpl2 implements DrawApi
{

    @Override
    public void draw(int x, int y, int radius)
    {
        System.out.println("DrawaPI 2 x:"+x+",y:"+y+",radius:"+radius);
    }

}

