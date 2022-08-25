package com.bilgeadam.boost.week2;

public class StarPattern2 {

	public static void main(String[] args) {
		
//		int i,j;
//		System.out.print("*");
//		
//		for (i=0; i<=4 ; i++) {
//			for(j=0; j<2*i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		for (int i=0 ; i<=10 ; i+=2) {
			int count=0;
			do { System.out.print("*");
			     count++;
				
			} while (count<i);
			System.out.println();
			
		}
        
	}

}
           