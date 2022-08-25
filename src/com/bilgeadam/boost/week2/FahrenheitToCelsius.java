package com.bilgeadam.boost.week2;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		double F, C;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the Fahrenheit degree you want to convert to Celsius:");
		F= scanner.nextDouble();
		scanner.close();
		C=(F-32)/1.8;
		System.out.println(F+" F degree = " + C +" C degree");
		System.out.println("üüüğüğü");

	}

}
