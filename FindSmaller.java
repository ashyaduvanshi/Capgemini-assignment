package com.cg.feb22.assignment;

import java.util.Scanner;

public class FindSmaller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int temp = a<b?a:b;
		System.out.println(temp + " is smaller");
		
	}
}
