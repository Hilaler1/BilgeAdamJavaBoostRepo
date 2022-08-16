package com.bilgeadam.boost.week02.lesson2;

import java.util.Scanner;

public class ArithmeticExamples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter the number to divide:");
		int num1=scanner.nextInt();
		System.out.print("please enter the divisor number:");
		int num2=scanner.nextInt();
		System.out.println(num1+ " divided by "+num2+" is "+ num1/num2);
		System.out.println("The remainder of dividing "+num1+ " by "+num2+" is "+ num1%num2);
	    scanner.close();
	    
	}
	

}
