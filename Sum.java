package test;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			int num = sc.nextInt();
			System.out.println(num);

			sum = sum + num;
		}
		System.out.println("SUM OF NUMBER" + " " + sum);
	}
}
