package com.cg.feb22.assignment;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int r = 0;

		System.out.println("Original Number: " + n);

		while (n != 0) {

			int digit = n % 10;
			r = r * 10 + digit;

			n /= 10;
		}

		System.out.println("Reversed Number: " + r);
	}

}
