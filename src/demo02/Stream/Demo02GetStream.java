package demo02.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/*
 * java.util.stream.Stream<T>是Java 8 新加入的最常用的流接口。（这并不是一个函数接口）
 * 获取一个流非常简单，有以下击中常用的方式：
 * 		-所有的Collection集合都可以通过stream默认方法获取；
 * 			default Stream<E> stream()
 * 		-Stream接口的静态方法ofk可以获取数组对应的流
 * 			static <T> Stream<T> of(T... values)
 * 			参数是一个可变参数，那么我们就可以传递一个数组
 */
public class Demo02GetStream {
	public static void main(String[] args) {
		//把集合转换为Stream流
		List<String> list = new ArrayList<String>();
		Stream<String> stream1 = list.stream();
		
		Set<String> set = new HashSet<String>();
		Stream<String> stream2 = set.stream();
		
		Map<String, String> map = new HashMap<>();
		//获取键，存储到一个set集合中
		Set<String> keyset = map.keySet();
		Stream<String> stream3 = keyset.stream();
		
		//获取值，存储到一个Collection集合中
		Collection<String> values = map.values();
		Stream<String> stream4 = values.stream();
		
		//获取键值对（键与值的映射关系 entrySet()）
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		Stream<Map.Entry<String, String>> stream5 = entrys.stream();
		
		//把数组转换为Stream流
		Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);
		//可变参数可以传递数组,字符串数组也可行
		Integer [] arr = {1, 2, 3, 4, 5};
		Stream<Integer> stream7 = Stream.of(arr);
	}
}
