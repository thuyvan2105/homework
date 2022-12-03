package review;

public class Ex05Symmetric {
	public static void main(String[] args) {
		int number = 15236;

		System.out.println(number + " is symmetric --> " + isSymmetric(number));

	}

	private static boolean isSymmetric(int n) {
		String text = String.valueOf(n); // convert number to String

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
