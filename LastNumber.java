package test;

import java.util.Scanner;

public class LastNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int last;
		int end;
			last=num%10;
			end=last;
			if(end==7) {
			
			System.out.println("yes");
			} else {
				System.out.println("No");
		}
		}
	
}
