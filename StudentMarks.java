package com.cg.feb22.assignment;
import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		if(m>=90) {
			System.out.println("Congratulations for getting A grade");
		}
		
		else if(m>=60 && m<90) {
			System.out.println("Congratulations for getting B grade");
		}
		
		else if(m>=40 && m<60) {
			System.out.println("Congratulations for getting C grade");
		}
		
		else {
			System.out.println("Congratulations for getting D grade");
		}
	}
}
