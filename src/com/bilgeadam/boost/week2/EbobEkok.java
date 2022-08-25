package com.bilgeadam.boost.week2;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		int x,y,i ;
		int ebob = 1;
		int ekok;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter 2 numbers:");
		x= scanner.nextInt();
		y= scanner.nextInt();
		scanner.close();
		
		if(x<y) i=x;
		else i=y;
		
		for(; i<=x || i<=y ; i++) {
			if(x%i==0 && y%i==0) ebob=i;
			
			}
		System.out.println("girilen sayıların ebobu: " + ebob);
		ekok = (x*y)/ebob;
		System.out.println("girilen sayıların ekoku: " + ekok);
		
		
		
		

	}

}
