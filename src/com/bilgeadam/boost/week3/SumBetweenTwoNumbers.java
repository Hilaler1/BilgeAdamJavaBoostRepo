package com.bilgeadam.boost.week3;

public class SumBetweenTwoNumbers {

	public static void main(String[] args) {
		int result = summary(5, 10);
		System.out.println(result);
		
		
	}
	
	public static int summary(int a, int b) {
		
		if(a<b) {
			
			int sum = a+summary(a+1, b); 
			return sum;
		}
		return a;
		
			
	}
}
