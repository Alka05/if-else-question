package test;

import java.util.Scanner;

public class OddMultiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int number=3;
		int multiple;
		if(num%2==1) {
			multiple=(num*number);
			System.out.println(multiple);
		}
		

	}

}
