package com.java.designpattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Strategy> strategies = new ArrayList<Strategy>();
		strategies.add(new LinearSearchStrategy());
		strategies.add(new BinarySearchStrategy());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(5);
		arr.add(9);
		arr.add(19);
		arr.add(20);
		arr.add(1);
		arr.add(66);
		arr.add(55);
		arr.add(50);
		
		//arr.sort(null);
		
		
		boolean flag=false;
		
		int count=0;
		while (count<100)
		{
			if(flag)
			{
				strategies.get(0).solve(arr, 19);
				flag=!flag;
			}
			else
			{
				strategies.get(1).solve(arr, 19);
				flag=!flag;
			}
			
			count++;
		}
	}

}
