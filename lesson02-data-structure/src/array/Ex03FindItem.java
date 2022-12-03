package array;

import java.util.Arrays;

import bean.Item;

/**
  Tìm những mặt hàng có giá lớn hơn 200
 */

public class Ex03FindItem {
	public static void main(String[] args) {
		Item itemA = new Item("123", "ItemA", 250);
		Item itemB = new Item("234", "ItemB", 150);
		Item itemC = new Item("345", "ItemC", 350);
		Item itemD = new Item("456", "ItemD", 200);
		Item itemE = new Item("567", "ItemE", 100);
		
		Item[] items = {itemA, itemB, itemC, itemD, itemE};
		Item[] result = findItem(items);
		for (Item item : result) {
			System.out.println(item);
		}
		
	}

	private static Item[] findItem(Item[] items) {
		Item[] result = new Item[items.length];
		int count = 0;
		for (Item item : items) {
			if (item.getPrice() > 200) {
				result[count] = item;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

}
