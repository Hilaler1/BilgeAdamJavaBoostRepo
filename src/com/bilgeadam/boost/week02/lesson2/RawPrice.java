package com.bilgeadam.boost.week02.lesson2;

import java.util.Scanner;

public class RawPrice {

	public static void main(String[] args) {
		
//		product end price = (raw price*1.15)*1.18 
//		calculate raw price

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the end price of the product: ");
		double EndPrice= scanner.nextDouble();
		scanner.close();
		double RawPrice = (EndPrice/1.18)/1.15;
		System.out.println("Raw price of product: " + RawPrice );
	}

}
