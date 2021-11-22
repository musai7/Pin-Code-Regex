package com.bridgeit.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PostalPin {

	public static void main(String[] args) {

		String pattern = "[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}";

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter pin code");

		while (true) {

			String pinCode = scanner.nextLine();
			if (Pattern.matches(pattern, pinCode)) {
				System.out.println("valide pin number : " + pinCode);
				break;
			} else
				System.out.println("enter valide pin code");
		}
	}
}
