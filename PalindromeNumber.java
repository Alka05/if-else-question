package test;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int tempt = num;//storing input in 
		int reminder;
		int number = 0;
		while (num >0) {
			reminder = num % 10;//getting reminder

			number = (number * 10) + reminder;
			num = num / 10;//getting natural number																														
		}
		if (tempt == number) {//checking tempt equal to sum or  not

			System.out.println("Palindromoe");
		} else {
			System.out.println("Not Palindromoe");
		}

	}

}
