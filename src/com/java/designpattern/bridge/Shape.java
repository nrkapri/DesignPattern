/**-----------------------------------------------------------------------------------------------
 *  Description:	TODO
 *  
 *  Author:		 NAYANK
 *  Supervisor:  TODO
 *  Date:		 May 21, 2018	
 *  Version:	 Design Pattern
 * 
 * @Copyright Amdocs Inc., 2007.
 * This document contains proprietary and confidential information,
 * and shall not be reproduced, transferred, or disclosed to others,
 * without the prior written consent of Amdocs.
 * --------------------------------------------------------------------------------------------------*/
 /* ----------------------------------------------------------------------------------------------------------------
 * Change History :
 * ----------------------------------------------------------------------------------------------------------------
 * ---------
 * Change #1
 * ---------
 * Version:            
 * Defect ID:           
 * CR ID:              
 * Date:               
 * Programmer:         
 * Supervisor:         
 * Changed:			   
 * Description:        
 
 *----------------------------------------------------------------------------------------------------*/
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

