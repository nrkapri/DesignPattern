package com.java.designpattern.behavioral.strategy;

import java.util.List;

public class LinearSearchStrategy implements Strategy {

	@Override
	public void solve(List<Integer> arr,int key) {
		// TODO Auto-generated method stub
		System.out.println("Linear:");
		for(Integer i : arr)
		{
			if(i==key)
			{
				System.out.println(key+"found.");
				break;
			}
		}
	}

}
