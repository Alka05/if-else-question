package test;

import java.util.Scanner;

public class VowelsConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("character");
		String name = sc.nextLine();
		if (name.equals("a") || name.equals("e") || name.equals("i" )|| name.equals("o") || name.equals("u")) {
			System.out.println("character of vowel" + " " + name);
		} else {
			System.out.println("character of consonants" + " " + name);
		}
	}

}
