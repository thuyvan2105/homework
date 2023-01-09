package immutable;

/**
 * Thao táo với split theo space+, compa@space, text&number
 */

public class Ex06Split {
	public static void main(String[] args) {
		String greeting = "cheers    out of my home";
		String line = "John Smith, 18, 17T2, 15/08/2002";
		String hobbies = "Game   -  -  Tennis - Badminton";
		String text = "a567bhc876okt012xyz"; // before a --> empty space

		String[] words = greeting.split("\\s+");
		showText(words);

		System.out.println("=====================");

		String[] properties = line.split(",\\s");
		showText(properties);

		System.out.println("=====================");

		String[] games = hobbies.split("[\\s-]+");
		showText(games);

		System.out.println("=====================");

		String[] digits = text.split("[a-z]+");
		showText(digits);

	}

	private static void showText(String[] elements) {
		for (String element : elements) {
			if (!element.isEmpty()) {
				System.out.println(element);
			}

		}
	}

}
