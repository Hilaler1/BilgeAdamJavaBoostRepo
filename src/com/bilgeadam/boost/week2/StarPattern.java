package com.bilgeadam.boost.week2;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		String answer = null;
		do {int x,i,j;
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("Please enter a number: ");
		if(scanner.hasNextInt()) {
		x=scanner.nextInt();
		for (i=1; i<=x ; i++) {
			for(j=i; j>0 ; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("wanna do it again? (Y/N)");
		answer= scanner.next();
		} else {System.out.println("wrong input!! Wanna try it again? (Y/N)");
		scanner.next();
		answer= scanner.next();}	
		} while (answer.equalsIgnoreCase("y"));
		
		
		

	}

}
