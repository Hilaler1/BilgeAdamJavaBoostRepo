package com.bilgeadam.boost.week3;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {
		
         if (oddEven()) System.out.println("Entered number is even!");
         else System.out.println("Entered number is odd!");
	}
    
	public static boolean oddEven() {
		
		System.out.println("Please enter a number: ");
		Scanner scanner=new Scanner(System.in);
		int number= scanner.nextInt();
		scanner.close();
		if(number%2==0)
			return true;
		else 
			return false;}

	
}
