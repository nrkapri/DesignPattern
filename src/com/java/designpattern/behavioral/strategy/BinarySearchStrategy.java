package com.java.designpattern.behavioral.strategy;

import java.util.Arrays;
import java.util.List;

public class BinarySearchStrategy implements Strategy {

	@Override
	public void solve(List<Integer> arr, int key ) {
		System.out.println("Binary:");
		// TODO Auto-generated method stub
		
		
		Integer []	a=arr.toArray(new Integer[arr.size()]);
		
		System.out.println(Arrays.binarySearch(a, key));
	}

}
