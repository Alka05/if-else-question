package test;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int sum = 0;
		int factor = 0;
		for (int number = 1; number < num; number++) {
			if (num % number == 0) {
				System.out.println(number);
				sum = sum + number;
				factor = number;
			}
		}
		System.out.println("sum of factors"+" "+ sum);

		if (sum == num) {
			System.out.println("Number is perfect");
		} else {
			System.out.println("Number is not perfect");
		}
	}
}
