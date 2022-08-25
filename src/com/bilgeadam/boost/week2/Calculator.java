package com.bilgeadam.boost.week2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
	 int num1,num2;
	 String operator;
	 double result = 0;
	 
	 
	 Scanner scanner= new Scanner(System.in);
	 
	 System.out.print("enter first number: ");
	 num1= scanner.nextInt();
	 System.out.print("enter second number: ");
	 num2= scanner.nextInt();
	 System.out.print("enter your operator: ");
	 operator= scanner.next();
	 scanner.close();
	 
//	 burada operatorü char olarak da tanımlayabilirdik.
//	 char operator = scanner.next().charAt(0); gibi
	 
	switch (operator) {
	case "+" : result= num1 + num2;
	          break;
	case "-" : result= num1-num2;
	          break;
	case "*" : result=num1*num2;
	          break;
	case "/" : result= num1/num2;
	          break;
	default: System.out.println("please enter valid operator!");
	
	}
	 
	System.out.println( num1+operator+ num2 + " = " + result);
//	burada bu çıktıyı normalde caselerin içine yazmalıyız.
//	çünkü bu yazıda default a düştüğünde de bu çıktı geliyor ve 0 gösteriyor.
//	Ayrıca bu yazıda result ı başlangıçta 0 olarak almamız gerekli. çünkü her türlü yazılıyor.

	}

}
