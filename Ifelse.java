package ifelse;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ifelse {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		System.out.println("Enter a number");
		int number = Integer.parseInt(br.readLine());
		if ((number % 3 == 0) && (number % 15 == 0)) {
			System.out.println("chocolate");
		} else if (number % 3 == 0) {
			System.out.println("choco");
		} else {
			System.out.println("late");
		}
	}

}