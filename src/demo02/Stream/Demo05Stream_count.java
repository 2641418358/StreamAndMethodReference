package demo02.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * 正如旧集合 Collection 当中的 size 方法一样，流提供 count 方法来数一数其中的元素个数
 * Long count();
 * count方法是一个终结方法，返回值是一个long类型的整数
 * 所以不能再继续调用Stream流中的其他方法了
 */
public class Demo05Stream_count {
	public static void main(String[] args) {
		//获取y一个List流
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		Stream<Integer> stream = list.stream();
		long count = stream.count();
		System.out.println(count);
	}
}
