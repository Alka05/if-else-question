package test;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		for (int num = 1; num <= number; num++) {
			if (number % num == 0) {
				System.out.println(num+"factor");
		}
		System.out.println(num);

	}
	}
}
