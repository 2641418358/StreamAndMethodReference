package demo02.Stream;

import java.util.stream.Stream;

/*
 *
 * limit������һ���ӳٷ�����ֻ�Ƕ����е�Ԫ�ؽ��н�ȡ
 * ���ص���һ���µ��������Կ��Լ�������Stream���е���������
 */
public class Demo06Stream_limit {
	public static void main(String[] args) {
		//��ȡһ��Stream��
		String[] arr = {"������","ϲ����","������","��̫��","��̫��"};
		Stream<String> stream = Stream.of(arr);
		//ʹ��limit������Stream���е�Ԫ�ؽ��н�ȡ��ֻҪǰ3��Ԫ��
		Stream<String> stream2 = stream.limit(3);
		stream2.forEach(name -> System.out.println(name));
	}
}
