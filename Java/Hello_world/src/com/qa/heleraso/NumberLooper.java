package com.qa.heleraso;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberLooper {
	static Scanner myObj = new Scanner(System.in);
	public static void loopNum() {
		System.out.println("0 for Numbers, 1 For string");
		int numOrString = myObj.nextInt();
		System.out.println("First Number to loop");
		int loopNum1 = myObj.nextInt();
		System.out.println("Second Number to loop");
		int loopNum2 = myObj.nextInt();
		int i = 0;
		int arrayCalculations = (loopNum2 - loopNum1) + 1;
		if (numOrString == 0) {
			while (loopNum1 <= (loopNum2 - 1)) {
				System.out.println(loopNum1);
				int theArray[] = new int[arrayCalculations];
				theArray[i] = loopNum1;
				ArrayList<Integer> theArrayList = new ArrayList<>();
				theArrayList.add(loopNum1);
				System.out.println(theArray[i] * 10);
				System.out.println(theArrayList);
				loopNum1++;
				i++;

			}
		} else {
			while (loopNum1 <= loopNum2) {
				System.out.println(convertNumber(loopNum1));
				loopNum1++;

			}
		}

	}

	private static final String[] units = { "", " one", " two", " three", " four", " five", " six", " seven", " eight",
			" nine" };
	private static final String[] twoDigits = { " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen",
			" sixteen", " seventeen", " eighteen", " nineteen" };
	private static final String[] tenMultiples = { "", "", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };
	private static final String[] placeValues = { " ", " thousand", " million", " billion", " trillion" };

	private static String convertNumber(long number) {
		String word = "";
		int index = 0;
		do {
			// take 3 digits in each iteration
			int num = (int) (number % 1000);
			if (num != 0) {
				String str = ConversionForUptoThreeDigits(num);
				word = str + placeValues[index] + word;
			}
			index++;
			// next 3 digits
			number = number / 1000;
		} while (number > 0);
		return word;
	}

	private static String ConversionForUptoThreeDigits(int number) {
		String word = "";
		int num = number % 100;
		if (num < 10) {
			word = word + units[num];
		} else if (num < 20) {
			word = word + twoDigits[num % 10];
		} else {
			word = tenMultiples[num / 10] + units[num % 10];
		}

		word = (number / 100 > 0) ? units[number / 100] + " hundred" + word : word;
		return word;
	}
	// Sourced From
	// https://www.netjstech.com/2018/11/converting-numbers-to-words-java-program.html
}
