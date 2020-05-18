package test;

import java.util.Scanner;

public class UserNumberSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int sum = 0;
		for (int number = 1; number <= num; number++) {
			sum = sum + number;
		}
		System.out.println("sum of number" + " " + sum);

	}

}
