package com.cg.feb22.assignment;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int n1=0; int n2=1;
		while (n1 <= n) {
		      System.out.print(n1 + ", ");

		      int n3 = n1 + n2;
		      n1 = n2;
		      n2 = n3;

		    }
	}

}
