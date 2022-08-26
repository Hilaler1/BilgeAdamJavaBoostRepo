package com.bilgeadam.boost.week3;

import java.util.Scanner;

public class ShapeTest {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ShapeTest shapeTest = new ShapeTest();
		shapeTest.readInput();
		System.out.println("Bye...");

	}

	private void readInput() {
		boolean remain = true;
		int count = 0;
		while (remain) {
			int edge[] = new int[4];

			System.out.println("Lutfen hesaplamak istediginiz seklin (en fazla 4 kenar) kenar uzunluklarini giriniz. ( -1 ile cikis yapabilirsiniz ) ");
			for (int i = 0; i < 4; i++) {
				System.out.print("Lutfen " + (i + 1) + ". kenar uzunlugunu giriniz (0 ile sonlandir) :");
				edge[i] = scanner.nextInt();

				if (i == 2 && edge[i] == 0) {
					System.err.println("iki kenarli sekil olmaz.");
					break;

				} else if (i == 0 && edge[i] == 0) {
					System.err.println("ilk uzunluk sifir olamaz.");
					break;
				} else if (i == 1 && edge[i] == 0) {
					System.err.println("bir kenarli sekil olamaz.");
					break;
				} else if (edge[i] == -1) {
					remain = false;
					break;
				} else if (edge[i] < 0) {
					System.err.println("uzunluk negatif olamaz!");
					i--;
					break;
				} else if (i == 3) {

					count++;
					System.out.println(count + ". seklin alani: " + areaCalculator(edge));
					System.out.println(count + ". seklin cevresi: " + perimeterCalculator(edge));

					break;

				} else
					continue;
			}
		}
	}

	private int areaCalculator(int[] edge) {
		int alan = (edge[0] * edge[1]) + (edge[2] * edge[3]); // doğru olmayan bazı hesaplamalar.
		return alan;
	}

	private int perimeterCalculator(int[] edge) {
		int perimeter = edge[0] + edge[1] + edge[2] + edge[3];
		return perimeter;
	}

}
