package com.bilgeadam.boost.week2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int n= scanner.nextInt();
		scanner.close();
		
		System.out.print(n1+" "+n2);
		
		for(int i=2; i<n ;i++) {
        n3=n2+n1;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
			}
			
			
			
		}
		

	}


