package exception;

/**
 * Opt3: check condition and throw exception before calling function
 * throw from function and being caught at called function                     
 */

public class Ex03Divide0Throw {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		try {
			System.out.println(devide(a, b));
		} catch (ArithmeticException e) {
			System.out.println("Message " + e.getMessage());
		}

		System.out.println("Back to Main method");
	}

	private static int devide(int a, int b) /* throws Exception */ {
		if (b == 0) {
			throw new ArithmeticException("-- Divide by zero /0--");
		}

		return a / b;
	}

}
