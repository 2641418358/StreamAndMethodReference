package demo02.Stream;

import java.util.stream.Stream;

public class Demo08Stream_concat {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.of("���޼�","������","����","����","����");
		String[] arr = {"������","ϲ����","������","��̫��","��̫��"};
		Stream<String> stream2 = Stream.of(arr);
		//���������������Ϊһ����
		Stream<String> stream = Stream.concat(stream1, stream2);
		stream.forEach(name -> System.out.println(name));
		
	}
}
