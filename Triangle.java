package test;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int sum = 0;
		for (int number = 1; number <= 3; number++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			int num = sc.nextInt();
			sum = sum + num;
		}
		if (sum == 180) {
			System.out.println("Posible");
		} else {
			System.out.println("not posible");
		}

	}

}
