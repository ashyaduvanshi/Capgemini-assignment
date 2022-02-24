package com.cg.feb22.assignment;

import java.util.Scanner;

public class FindBigger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else if(b>a) {
			System.out.println(b+" is greater than "+a);
		}
		else {
			System.out.println("Both are same");
		}
	}
}
