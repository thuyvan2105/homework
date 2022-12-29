package math;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal (dùng với số thập phân) & BigInteger (dùng với số nguyên)
 * calculator method >> add, subtract, mutiple, divide
 * rounding >> setScale, roundingMode
 * When use those, need to consider business >> memory >> format >> convention
 */

public class Ex02Decimal {
	public static void main(String[] args) {
		// only have 3 default values
		BigDecimal a = BigDecimal.ZERO;
		BigDecimal b = BigDecimal.ONE;
		BigDecimal c = BigDecimal.TEN;
		
		// when you need another value => .valueOf()
		BigDecimal d = BigDecimal.valueOf(246.18); // double 
		BigDecimal e = BigDecimal.valueOf(220); // long
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		
		// calculator method
		BigDecimal add = d.add(e); // d + e
		BigDecimal sub = d.subtract(e); // d - e
		BigDecimal mul = d.multiply(e); // d * e
		BigDecimal div = d.divide(e); // d / e
		
		/*
		 * With divisor: if e is a double number => cannot use divide(BigDecimal divisor)
		 * Solution --> divide(BigDecimal divisor, int scale, int roundingMode)
		 * EX: BigDecimal div = d.divide(e, 2, RoundingMode.HALF_UP);
		 */
		
		System.out.println("add: " + add);
		System.out.println("sub: " + sub);
		System.out.println("multiple: " + mul);
		System.out.println("divide: " + div);
		
		// calculation with huge value 
		BigDecimal bigD = BigDecimal.valueOf(99999).multiply(BigDecimal.valueOf(9999999999d));
		System.out.println("bigD: " + bigD);
		
		double decV = 99.99 * 256.567879;
		System.out.println("decV: " + decV);
		BigDecimal decRound = BigDecimal.valueOf(decV).setScale(2, RoundingMode.HALF_UP);
		System.out.println("decRound: " + decRound);
		
		/*
		 * Divisor => support rounding mode in function
		 * Multiple => don't support => need to call "rounding mode" function 
		 */
		
	}

}
