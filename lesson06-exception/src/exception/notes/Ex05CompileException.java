package exception.notes;

/**
 * Compile exception >> checkedException >> "try-catch" is required
 * Tại sao bắt buộc try-catch?
 * >> Những exception liên quan đến xử lý file, input, output
 *    Chẳng hạn như đ�?c một file, mà file đó không tồn tại thì làm sao mà đ�?c file đó được.
 *    �?ể an toàn => bắt buộc xử lý exception trước khi đ�?c file 
 *    
 * Khi không có path cụ thể => File sẽ được đặt ở "relative project path" (đư�?ng dẫn dự án tương đối)
 * Cụ thể trong lesson06-exception
   File file = new File("readme.md"); // khai báo, khởi tạo đối tượng
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
			fw.write("Lesson06-exception\n"); // ghi nội dung vào file
			
			// LOG 99 exception in readme.md file
			// IOException
			write(fw, "Exception 01 ...");
			write(fw, "Exception 02 ...");
			
			// write(fw, "" + 5/0; => Arithmetic Exception
			
			write(fw, "Exception 99 ...");
			
			//fw.close(); // save and close file
			// Giả sử giữa chừng dòng code số 71 bị exception 
			// => tất cả các dòng code trước đó sẽ ko được lưu 
			// Giải pháp: "finally"
			
			// Multiple exceptions:
			// + Opt1: Arithmetic Exception | IOException => con trước cha => catch (con | cha) (from version 1.7)
			// + Opt2: Exception
			
			// More readable: Opt1 
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			// always run 
			// Dù có bị exception hay ko (có vào catch hay ko), có return hay ko => luôn chạy
			/*
			 * Flow: e.printStackTrace(); -> fw.close(); -> catch (IOException ex) -> return false
			 */
			try {
				fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		// Warning: Resource leak: 'fw' is not closed at this location
		// Khi fw = new FileWriter(file); => JAVA sẽ tạo connection của file đến system
		// Mở file đó ra, kiểm tra xem ghi được hay không 
		// Dùng hàm write => fw.write("Lesson06-exception\n") => sẽ ghi nội dung vào file
		// Ghi xong, "return true" luôn thì file vẫn nằm đó
		// Nghĩa là, ghi xong rồi tắt app => file đó vẫn chưa được save lại mà đã tắt => data ko đc ghi vào file 
		// => Cần dùng hàm để save lại => Dùng fw.close();
		return true;
	}
	
	private static void write(FileWriter fw, String line) throws IOException {
		fw.write(line + "\n");
	}
	
	private static File createNewFile(String path) {
		// Nếu file đã tồn tại => return chính file đó 
		// Chưa tồn tại => tạo file mới ra
		File file = new File(path); // khai báo
		if (!file.exists()) {
			boolean isSuccess = false;
			try {
				isSuccess = file.createNewFile(); // tạo file
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(isSuccess);
		}
		return file;
	}

}
