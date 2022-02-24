package com.cg.feb22.assignment;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Question - a
		
		int a = sc.nextInt();
		if(a%2 == 0) {
			System.out.println(a);
		}
		else {
			System.out.println(a+1);
		}
		
		// Question - b
		
		int b = sc.nextInt();
		if(b%2 == 0) {
			System.out.println(b-1);
		}
		else {
			System.out.println(b);
		}
	}
}
