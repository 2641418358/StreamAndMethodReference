package demo02.Stream;

import java.util.stream.Stream;

/*
 * Stream流中的常用方法_forEach
 * java.util.function.Consumer<T>接口是一个消费型接口。 
 * Consumer接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据。
 * 
 * 简单记：
 * 	forEach方法，用来遍历流中的数据
 * 	是一个终结方法，遍历之后就不能继续调用Stream流中的其他方法
 */
public class Demo02Stream_forEach {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		//获取一个Stream流
		Stream<String> stream = Stream.of("张三","李四","王五","赵六","田七");
		//使用Stream流中的forEach对Stream流进行遍历
		stream.forEach(name -> System.out.println(name));
		
	}
}
