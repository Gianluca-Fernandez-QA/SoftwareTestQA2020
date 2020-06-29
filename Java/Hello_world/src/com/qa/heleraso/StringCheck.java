package com.qa.heleraso;

import java.util.Scanner;


public class StringCheck {
	static Scanner myObj = new Scanner(System.in);
	public static void checker() {
		System.out.print("Enter First string ");
		String cheString1 = myObj.nextLine();
		System.out.print("Enter Second string ");
		String cheString2 = myObj.nextLine();
		if (cheString2.equals(cheString1)) {
			System.out.println("These match");
		} else {
			System.out.println("These don't match");
		}
	}
}
