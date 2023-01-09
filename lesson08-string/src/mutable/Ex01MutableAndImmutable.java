package mutable;

/**
 * append >> add char
 * 
 * Result
 * i: 1586600255
 * i: 474675244
 * m: 932583850
 * m: 932583850
 * 
 * mutable >> cập nhật giá trị trong chính ô nhớ đó luôn
 * immutable >> khi cập nhật sẽ tạo ô nhớ mới lưu giá trị mới cập nhật đó
 */

import utils.JvmUtils;

public class Ex01MutableAndImmutable {
	public static void main(String[] args) {
		// immutable & mutable

		// immutable >> String literal >> save in constant pool
		String i = "Box";
		JvmUtils.hash("i", i);

		// Reassign i
		i = i.concat(" Layout !"); // i = i + "Layout"
		JvmUtils.hash("i", i);

		System.out.println("========================");

		// mutable >> StringBuilder || StringBuffer >> save in normal heap
		StringBuilder m = new StringBuilder("Builder");
		JvmUtils.hash("m", m);

		m.append("Pattern")
		 .append("Java");
		JvmUtils.hash("m", m);

	}

}
