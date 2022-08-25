package com.bilgeadam.boost.week2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		double height, weight,bmi;
		String gender;
		
		
//		String x= "asd";
//		String y= "asd";
//	    if (x==y) System.out.println(" == doğru çıktı");
//	    if(x.equals(y)) System.out.println("equals doğru çıktı");
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("enter your weight: ");
        weight= scanner.nextDouble();
        System.out.print("enter your height: ");
        height= scanner.nextDouble();
        System.out.print("enter your gender(M/W): ");
        gender=scanner.next();
        scanner.close();
        
        bmi=(weight*10000)/Math.pow(height, 2);
        
        if (gender.equalsIgnoreCase("W")) {
        	if(bmi<19) System.out.println("Weak");
        	else if(bmi<24) System.out.println("Normal");
        	else if(bmi<30) System.out.println("Fat");
        	else System.out.println("Obese"); 	
        }    
        
        else if (gender.equalsIgnoreCase("M")) { 
        	if (gender.equalsIgnoreCase("M")) {
            	if(bmi<20) System.out.println("Weak");
            	else if(bmi<25) System.out.println("Normal");
            	else if(bmi<30) System.out.println("Fat");
            	else System.out.println("Obese"); 	
            }    
        }
        
        else System.out.println("Wrong type");
        
        
        
        
	}

}
