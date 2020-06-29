package com.qa.heleraso;

import java.util.ArrayList;
import java.util.Scanner;

public class calculator {
	static Scanner myObj = new Scanner(System.in);

	public static void calcuMath() {
		System.out.print("Pick +, -, /, * ");
		String cond = myObj.nextLine();
		System.out.print("First Num ");
		double firstNum = myObj.nextDouble();
		System.out.print("Second Num ");
		double secondNum = myObj.nextDouble();

		switch (cond) {
		case "+":
			System.out.println(firstNum + secondNum);

		case "-":
			System.out.println(firstNum - secondNum);

		case "/":
			System.out.println(firstNum / secondNum);

		case "*":
			System.out.println(firstNum * secondNum);

		default:
			System.out.println("Enter a conditional");
			break;

		}

	}

	

}
