package demo02.Stream;

import java.util.stream.Stream;

public class Demo03Stream_filter {
	public static void main(String[] args) {
		//获取一个Stream流
		Stream<String> stream = Stream.of("张无忌","张三丰","王五","赵六","田七");
		stream
		.filter(name -> name.startsWith("张"))
		.filter(name -> name.length() == 3)
		.forEach(name -> System.out.println(name));
		
		/*
		 * Stream流属于管道流，只能被消费一次
		 * d第一个Stream流已经被消费完毕，就会关闭了
		 * 所以第一个Stream流就不能再调用方法了
		 * stream has already been operated upon or closed
		 */
//		stream.forEach(name -> System.out.println(name));
	}
}
