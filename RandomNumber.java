package com.cg.feb22.assignment;
import java.lang.Math;


public class RandomNumber {
	public static void main(String[] args) {
		int max = 100;
		int min = 1;
		
		for(int i=0;i<5;i++) {
			int a = (int)(Math.random()*(max-min+1)+min);
			System.out.println(a);
		}
	}
}
