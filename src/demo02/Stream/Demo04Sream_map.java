package demo02.Stream;

import java.util.stream.Stream;

/*
 * �����Ҫ�����е�Ԫ��ӳ�䵽��һ�����У�����ʹ�� map ����
 * �ýӿ���Ҫһ�� Function ����ʽ�ӿڲ��������Խ���ǰ���е�T��������ת��Ϊ��һ��R���͵���
 * R apply(T t)
 *	����Խ�һ��T����ת����ΪR���ͣ�������ת���Ķ������ͳ�Ϊ��ӳ�䡱��  
 */
public class Demo04Sream_map {
	public static void main(String[] args) {
		//��ȡһ��String���͵�Stream��
		Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
		//ʹ��map���������ַ������͵�����ӳ����Integer������
		Stream<Integer> stream2 = stream.map((String s) -> {
			return Integer.parseInt(s);
		});
		//����Stream��
		stream2.forEach(i -> System.out.println(i));
	}
}
