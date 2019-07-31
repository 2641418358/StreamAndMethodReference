package demo02.Stream;

import java.util.stream.Stream;

/*
 * 如果希望跳过前几个元素，可以使用 skip 方法获取一个截取之后的新流：
 *		
 *	如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。
 */
public class Demo07Stream_skip {
	public static void main(String[] args) {
		//获取一个Stream流
		String[] arr = {"喜羊羊","美羊羊","懒洋洋","灰太狼","红太狼"};
		Stream<String> stream = Stream.of(arr);
		//使用skip方法对Stream流中的元素进行跳过，跳过前3个元素
		Stream<String> stream2 = stream.skip(3);
		stream2.forEach(name -> System.out.println(name));
	}
}
