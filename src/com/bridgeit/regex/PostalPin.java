package com.bridgeit.regex;

import java.util.regex.Pattern;

public class PostalPin {

	public static void main(String[] args) {
	
		String pattern = "[0-9]{6}";
		System.out.println(Pattern.matches(pattern, "123456"));
	}
}
