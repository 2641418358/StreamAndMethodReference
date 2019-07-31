package demo02.Stream;

import java.util.stream.Stream;

public class Demo08Stream_concat {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("张无忌","张三丰","王五","赵六","田七");
		String[] arr = {"美羊羊","喜羊羊","懒洋洋","灰太狼","红太狼"};
		Stream<String> stream2 = Stream.of(arr);
		//把以上两个流组合为一个流
		Stream<String> stream = Stream.concat(stream1, stream2);
		stream.forEach(name -> System.out.println(name));
		
	}
}
