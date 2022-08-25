package com.bilgeadam.boost.week3;

import java.util.Scanner;

public class AtmMethod {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		String username = "user";
		String password= "123";
		String custemerUsername="";
		String custemerPassword="";
		int count=3;
		double bakiye=1500;
		
		do {System.out.println("kullanici adini giriniz: ");
		custemerUsername = scanner.nextLine();
		System.out.println("sifrenizi giriniz: ");
		custemerPassword= scanner.nextLine();
		if (username.equals(custemerUsername) && password.equals(custemerPassword)) {
		String cevap= "";
		do{ 
		System.out.println("lutfen yapmak istediginiz islem numarasini giriniz.\n 1-Para yatirma \n 2-Para cekme \n 3-Bakiye sorgulama \n 4-Cikis");
	    int islem = scanner.nextInt();
	    switch (islem) {
	    case 1: System.out.print("yatirmak istediginiz tutari giriniz:");
	            double tutar= scanner.nextDouble();
	            bakiye=tutar+bakiye;
	            System.out.println("yatirilan para: " + tutar +"\ntoplam bakiye: " + bakiye);
	            break;
	    case 2: System.out.print("cekmek istediniz tutari giriniz: ");
	            tutar= scanner.nextDouble();
	            if(tutar>bakiye) System.out.println("yetersiz bakiye!");
	            else {
	            bakiye=bakiye-tutar;	
	            System.out.println("guncel bakiyeniz: " + bakiye);}
	            break;
	    case 3: System.out.println("bakiyeniz: " + bakiye + "TL");
	            break;
	    case 4: System.out.println("bizi tercih ettiginiz icin tesekkurler.");
	            System.exit(0);
	            break;
	    default: System.out.println("lutfen gecerli bir giris yapiniz.");
	             break;
	    }  
	    System.out.println("baska islem yapmak istiyor musunuz? (E/H)");
	    cevap =scanner.next();
	    } while (cevap.equalsIgnoreCase("e"));
			
		} else {
			System.out.println("yanlis bilgi girdiniz.");
			count--;
			if(count==0) {System.out.println("kartiniz bloke olmustur.");
			               System.exit(0);}
			else System.out.println("kalan hakkiniz: " + count);
			
			
		}
		
		} while (!(username.equals(custemerUsername) && password== custemerPassword));
		
		
		scanner.close();
		
		
		
	}
}
