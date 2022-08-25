package com.bilgeadam.boost.week3;

public class Method2 {

	public static void main(String[] args) {
		String x=NotHesaplama(189.6);
		System.out.println("your grade is "+x);
		
	}
        public static String NotHesaplama (double not) {
        
			if (not>=200.5) 
        		return "A";
			
        	else if(not>122.4)
        		return "B";
			
        	else return "C";
        		
        }
}
