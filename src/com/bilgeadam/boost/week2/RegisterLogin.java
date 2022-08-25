package com.bilgeadam.boost.week2;

import java.util.Scanner;

public class RegisterLogin {

	public static void main(String[] args) {
		int n;
		String userName= "";
		String password= "";
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("1-Register \n2-Login");
		n= scanner.nextInt();
		
		switch (n) {
		case 1: 
			
			System.out.println("Welcome to register page! please enter a username :");
			userName = scanner.next();
			System.out.println("Please enter a password :");
			password = scanner.next();
			System.out.println("Your account is created!");
			break;
			
		case 2:
			
			System.out.println("Please enter your username :");
			String userNameEntry= scanner.next();
			System.out.println("Enter your password :");
			String passwordEntry=scanner.next();
			
			if (userNameEntry.equals(userName) && passwordEntry.equals(password)) 
				System.out.println("Welcome!!");
			else 
				System.out.println("Wrong username or password");
			break;
			
			}
		
		scanner.close();
		
		 
		 
		
		
		

	}

}
