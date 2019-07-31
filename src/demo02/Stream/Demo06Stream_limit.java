package demo02.Stream;

import java.util.stream.Stream;

/*
 *
 * limit方法是一个延迟方法，只是对流中的元素进行截取
 * 返回的是一个新的流，所以可以继续调用Stream流中的其他方法
 */
public class Demo06Stream_limit {
	public static void main(String[] args) {
		//获取一个Stream流
		String[] arr = {"美羊羊","喜羊羊","懒洋洋","灰太狼","红太狼"};
		Stream<String> stream = Stream.of(arr);
		//使用limit方法对Stream流中的元素进行截取，只要前3个元素
		Stream<String> stream2 = stream.limit(3);
		stream2.forEach(name -> System.out.println(name));
	}
}
