package test;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		for (int a = 1; a <= 10; a++) {
			System.out.println(num + "*" + a + "=" + a * num);
		}
	}

}
