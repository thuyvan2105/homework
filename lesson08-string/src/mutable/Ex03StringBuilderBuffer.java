package mutable;

/**
 * MutableTask task = new MutableTask();
 * Trong task có thuộc tính mutable
 * lúc new ra => gán mutable = new StringBuffer() || StringBuilder()
 * Khi call tA.start() => lấy task (line 16) call đến hàm run()
 * --> 1 thread sẽ tạo ra 50.000 ký tự 
 * --> 2 threads => 100.000 ký tự 
 * 
 * tA.join();
 * --> Đoạn code sau, phải đợi cho A và B xong thì mới chạy
 * 
 * Với một chương trình đa luồng (dùng chung task)
 * + Nếu sử dụng StringBuffer  --> đảm bảo dữ liệu luôn luôn chính xác khi đồng bộ với nhau 
 * + Nếu sử dụng StringBuilder --> không đảm bảo
 */

public class Ex03StringBuilderBuffer {
	public static void main(String[] args) {
		// Mutable Task: exchange data >> StringBuilder || StringBuffer
		
		MutableTask task = new MutableTask();
		
		Thread tA = new Thread(task, "Thread-A");
		tA.start();
		
		Thread tB = new Thread(task, "Thread-B");
		tB.start();
		
		// to make sure 2 thread-main run after thread-A and thread-B
		try {
			tA.join();
			tB.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("length: " + task.length());
	}
	
	private static class MutableTask implements Runnable {
		
		// multiple threads access this task with share data
		// share data: StringBuilder || StringBuffer
		private StringBuffer mutable; // share data
		private int count = 100;
		
		public MutableTask() {
			mutable = new StringBuffer();
		}
 		
		@Override
		public void run() {
			for (int i = 1; i <= count; i++) {
				System.out.println(Thread.currentThread().getName() + "-->" + i);
				mutable.append("A");
			}
		}
		
		public int length() {
			// get share data
			return mutable.length();
		}
	}

}
