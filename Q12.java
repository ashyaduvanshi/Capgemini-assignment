package com.cg.feb22.assignment;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("First no.to be swapped");
		
		int m = sc.nextInt();
		System.out.println("Second no.to be swapped");
		int n = sc.nextInt();
		m = m + n; 
	    n = m - n; 
	    m = m - n;
	    
	    System.out.println("First no.="+m);
	    System.out.println("Second no.="+n);
	}
}
