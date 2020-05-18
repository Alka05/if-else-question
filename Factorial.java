package test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		int fact = 1;
		for (int num = number; num > 0; num--) {
			fact = fact * num;
			System.out.println(num);

		}

		System.out.println("factor of num" + " " + fact);
	}
}
