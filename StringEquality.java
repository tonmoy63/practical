package com.kogent;

import java.util.Scanner;

public class StringEquality {
	public static void main(String s[]) {
		String str1,str2;
		Scanner ab= new Scanner(System.in);
		System.out.println("Enter first string");
		str1=ab.nextLine();
		System.out.println("Enter second string");
		str2=ab.nextLine();
		if (str1.equals(str2))
			System.out.println("Equal Strings");
		else
			System.out.println("Unequal String");
			
	}
}
