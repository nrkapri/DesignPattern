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


public class BrideDesignPatternTester
{

    public static void main(String[] args)
    {
       Shape[] shapes = new Shape[5];
       
       shapes[0]= new CircleShape(1,2,4,new DrawApiImpl1());
       
       shapes[1]= new CircleShape(1,2,8,new DrawApiImpl2());
       
       shapes[2]= new CircleShape(1,2,16,new DrawApiImpl1());
       
       shapes[3]= new CircleShape(1,2,32,new DrawApiImpl2());
       
       shapes[4]= new CircleShape(1,2,64,new DrawApiImpl1());
       
       
       for(Shape s : shapes)
       {
           s.draw();
           s.resizeByPercentage(50);
           s.draw();
       }
    }

}

