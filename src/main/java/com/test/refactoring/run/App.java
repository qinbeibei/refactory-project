package com.test.refactoring.run;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println(isLargeThan1000());

    }

	private static boolean isLargeThan1000() {
		if (getBasePrice() > 1000)
			return true;
		return false;
	}

	private static double getBasePrice() {
		return 0;
	}
}
