package com.bilgeadam.boost.week2;

import java.util.Scanner;

public class GetName {

	public static void main(String[] args) {
   
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter your name:");
		String name =scanner.nextLine();
		scanner.close();
		System.out.println("Hello " +name);

	}

}
