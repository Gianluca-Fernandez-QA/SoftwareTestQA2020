package com.qa.heleraso;

import java.util.Scanner;

public class calculator {
	static Scanner myObj = new Scanner(System.in);

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		System.out.print("Enter string ");
		String cheString1 =  myObj.nextLine();
		System.out.println(cheString1);
		System.out.println(stringCheck(cheString1));
		System.out.print("Pick +, -, /, * ");
		String cond = myObj.nextLine();
		System.out.println(calcuMath(cond));
		
	}

	public static double calcuMath(String gatto) {
		System.out.print("First Num ");
		double firstNum = myObj.nextDouble();
		System.out.print("Second Num ");
		double secondNum = myObj.nextDouble();

		switch (gatto) {
		case "+":
			return (firstNum + secondNum);

		case "-":
			return (firstNum - secondNum);

		case "/":
			return (firstNum / secondNum);

		case "*":
			return (firstNum * secondNum);

		default:
			System.out.println("Enter a conditional");
			break;

		}
		return 0;

	}

	public static String stringCheck(String checker) {

		String cheString2 = "Hello World";
		if (cheString2.equals(checker)) {
			return "These match";
		} else {
			return "These don't match";
		}
	}

}
