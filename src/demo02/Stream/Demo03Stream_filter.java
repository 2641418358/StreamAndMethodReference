package demo02.Stream;

import java.util.stream.Stream;

public class Demo03Stream_filter {
	public static void main(String[] args) {
		//��ȡһ��Stream��
		Stream<String> stream = Stream.of("���޼�","������","����","����","����");
		stream
		.filter(name -> name.startsWith("��"))
		.filter(name -> name.length() == 3)
		.forEach(name -> System.out.println(name));
		
		/*
		 * Stream�����ڹܵ�����ֻ�ܱ�����һ��
		 * d��һ��Stream���Ѿ���������ϣ��ͻ�ر���
		 * ���Ե�һ��Stream���Ͳ����ٵ��÷�����
		 * stream has already been operated upon or closed
		 */
//		stream.forEach(name -> System.out.println(name));
	}
}
