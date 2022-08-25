package com.bilgeadam.boost.week2;

import java.util.Scanner;

public class Horoscope {

	public static void main(String[] args) {
    String answer =null;
    Scanner scanner= new Scanner(System.in);
        do {
		
		System.out.print("please enter your birth year: ");
		int year= scanner.nextInt();
		int n= year%12;
			switch (n) {
			case 0:  System.out.println("Your chinese zodiac sign is Maymun.");
			break;
			case 1:  System.out.println("Your chinese zodiac sign is Horoz.");
			break;
			case 2:  System.out.println("Your chinese zodiac sign is Köpek.");
			break;
			case 3:  System.out.println("Your chinese zodiac sign is Domuz.");
			break;
			case 4:  System.out.println("Your chinese zodiac sign is Fare.");
			break;
			case 5:  System.out.println("Your chinese zodiac sign is Öküz.");
			break;
			case 6:  System.out.println("Your chinese zodiac sign is Kaplan.");
			break;
			case 7:  System.out.println("Your chinese zodiac sign is Tavşan.");
			break;
			case 8:  System.out.println("Your chinese zodiac sign is Ejderha.");
			break;
			case 9:  System.out.println("Your chinese zodiac sign is Yılan.");
			break;
			case 10:  System.out.println("Your chinese zodiac sign is At.");
			break;
			case 11:  System.out.println("Your chinese zodiac sign is Koyun.");
			break;
			default: System.err.println("Wrong input!");
			}
			System.out.println("do you wanna try again?(y/n)");
		    answer = scanner.next();
				
		} while (answer.equalsIgnoreCase("y"));
		
		scanner.close();

	}
           
}
