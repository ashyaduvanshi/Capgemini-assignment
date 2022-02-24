package com.cg.feb22.assignment;

import java.util.Scanner;

public class FindSumProd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = n;
		int sum = 0;
		int prod = 1;
		
		while(m!=0) {
			int temp = m%10;
			sum = sum + temp;
			m = m/10;
		}
		System.out.println(sum);
		m = n;
		while(m!=0) {
			int temp = m%10;
			prod = prod * temp;
			m = m/10;
		}
		
		System.out.println(prod);
	}
}
