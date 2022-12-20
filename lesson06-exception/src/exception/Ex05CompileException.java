package exception;

/**
 * Compile exception >> checkedException >> "try-catch" is required
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05CompileException {
	public static void main(String[] args) {
		File file = createNewFile("readme.md");

		boolean isSuccess = write(file);
		System.out.println("isSuccess: " + isSuccess);

		System.out.println("Back to MAIN Method");

	}

	private static boolean write(File file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Lesson06-exception\n");

			// LOG 99 exception in readme.md file
			// IOException
			write(fw, "Exception 01 ...");
			write(fw, "Exception 02 ...");

			// write(fw, "" + 5/0; => Arithmetic Exception

			write(fw, "Exception 99 ...");

			// fw.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return true;
	}

	private static void write(FileWriter fw, String line) throws IOException {
		fw.write(line + "\n");
	}

	private static File createNewFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			boolean isSuccess = false;
			try {
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(isSuccess);
		}
		return file;
	}

}
