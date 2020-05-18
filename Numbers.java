package test;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		for (int number = 1; number <= num; number++) {
			System.out.println(number);
		}
	}

}
