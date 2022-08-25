package com.bilgeadam.boost.week2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int x;
		boolean isprime= true;
		Scanner scanner= new Scanner(System.in);
		System.out.print("please enter a number: ");
		x= scanner.nextInt();
		scanner.close();
		
		if(x<0) System.out.println("please enter o naturel number");
		else if(x==0 || x==1) System.out.println("number is not prime!");
		else if(x>1) {
			for(int i=2; i<x; i++) { 
				if(x%i==0)  isprime=false;
				 }
		if(isprime) System.out.println("number is prime!");
		else System.out.println("number is not prime!");
				
		}
		
	}

}
