package com.bilgeadam.boost.week2;

public class MultiplicationTable {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=10;i++) {
			for (j=1;j<=10;j++) {
				System.out.print(j+"*"+j+"="+i*j+"\t");
				}
			System.out.println("\t");
		}
	}

}
