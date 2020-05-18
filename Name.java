package test;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter name");
		String name = in.nextLine();
		for (int num = 1; num <= 20; num++) {
			System.out.println("Hello" + " " + name);
		}

	}

}
