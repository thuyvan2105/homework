package utils;

/**
 * CharSequence là cha của String và StringBuilder
 */

public class JvmUtils {

	private JvmUtils() {
	}

	public static void hash(String text, CharSequence sequence) {
		System.out.println(text + ": " + System.identityHashCode(sequence));
	}

}
