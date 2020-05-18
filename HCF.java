package test;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");//user input
		int number = sc.nextInt();
		int number1 = sc.nextInt();
		int HCF = 0;//taking variable 
		for (int num = 1; num <= number1; num++) {//loop working till second input
			if (number % num == 0 && number1 % num == 0) {//checking  both condition is correct or not
				HCF = num;//factors are sorting in HCF variable  
				System.out.println(num);
			}
		}
		System.out.println("HCF" + HCF);//Here HCF number is print because its of of the loop

	}
}
