package math;

public class Ex01Math {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		boolean isPos = a > 0 && b > 0;
		
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		float c = 7.58f;
		// commercial round
		int round = Math.round(c); // not recommend to use this method
		double ceil = Math.ceil(c);
		double floor = Math.floor(c);
		
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		System.out.println("round: " + round); // 8
		System.out.println("ceil: " + ceil); // 8.0
		System.out.println("floor: " + floor); // 7.0
	}

}
