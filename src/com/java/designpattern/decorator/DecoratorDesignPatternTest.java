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

