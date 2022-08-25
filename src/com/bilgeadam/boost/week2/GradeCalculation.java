package com.bilgeadam.boost.week2;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		int midterm1,midterm2,finall;
		double grade;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter midterm1 grade: ");
		midterm1=scanner.nextInt();
		System.out.println("enter midterm2 grade: ");
		midterm2=scanner.nextInt();
		System.out.println("enter final grade: ");
		finall=scanner.nextInt();
		scanner.close();
		
		grade= (midterm1+midterm2)/2*0.4+finall*0.6;
		
		if (grade<50) System.out.println("FF");
		
		
		
		

	}

}
