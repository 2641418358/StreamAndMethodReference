package demo02.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * ����ɼ��� Collection ���е� size ����һ�������ṩ count ��������һ�����е�Ԫ�ظ���
 * Long count();
 * count������һ���ս᷽��������ֵ��һ��long���͵�����
 * ���Բ����ټ�������Stream���е�����������
 */
public class Demo05Stream_count {
	public static void main(String[] args) {
		//��ȡyһ��List��
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		Stream<Integer> stream = list.stream();
		long count = stream.count();
		System.out.println(count);
	}
}
