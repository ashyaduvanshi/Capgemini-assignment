package com.cg.feb22.assignment;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		//int mth=n/30;
		
		System.out.println("Months="+n/30);
		System.out.println("Days="+n%30);
	}

}
