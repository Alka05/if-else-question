package test;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		int average = 0;
		int sum = 0;
		for (int num = 1; num <= 5; num++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			int number = sc.nextInt();
			sum = sum + number;
			average++;
			average = sum / average;
		}
		System.out.println("sum" + sum);
		System.out.println("average" + average);
	}

}
