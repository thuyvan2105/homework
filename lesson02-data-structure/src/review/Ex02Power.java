package review;

import utils.InputUtils;

public class Ex02Power {
	public static void main(String[] args) {
		int n = InputUtils.input("Enter N (N>0)", 3);
		
		System.out.println("is power of 2 --> " + isPower(n));
		System.out.println("is power of 5 --> " + isPower(n, 5));
		
	}
	
	// Bội của 2
	private static boolean isPower(int n) {
		while (n != 1) {
			if (n % 2 != 0) {
				return false;
			}
			n /= 2;
		}
		return true;
	}
	
	// Bội của số bất kì
	private static boolean isPower(int power, int number) {
		/**
		while (power != 1) {
			if (power % number != 0) {
				return false;
			}
			power /= number;
		}
		return true;
		*/
		
		double result = Math.log(power)/Math.log(number);
		
		// Làm tròn trên == làm tròn dưới --> là số nguyên
		return Math.ceil(result) == Math.floor(result);
	}
	

}
