package utils;

import java.util.Scanner;

public class InputUtils {
	
private static Scanner ip = new Scanner(System.in);
	
	public static int input(String prefix, int maxWrongTimes) {
		int wrongTimes = 0;
		String text = "";
		do {
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + ") : " : ": ";
			System.out.print(prefix + suffix);

			text = ip.nextLine();
			if (text.matches("[1-9][0-9]{0,}") || text.matches("[0][0-9]{1,}")) {
				break;
			}

			wrongTimes++;
			if (wrongTimes == maxWrongTimes) {
				System.out.println("Wrong times = " + maxWrongTimes + "--- Please try again later ---");
				System.exit(0);
			}
		} while (true);
		return Integer.parseInt(text);
	}

}
