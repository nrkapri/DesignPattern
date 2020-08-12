package com.java.designpattern.bridge;


public abstract class Shape
{
    DrawApi drawApi;

    int x;
    int y ;
    int radius ;
    
    public Shape(int x, int y, int r, DrawApi d)
    {
        this.x=x;
        this.y=y;
        this.radius=r;
        this.drawApi=d;
    }
    
    public   void draw()
    {
        drawApi.draw(x,y,radius);
    }
    
    
    public abstract  void resizeByPercentage(int pct);
    
}

