package demo01.Stream;

import java.util.ArrayList;
import java.util.List;
/*
 * ʹ��Stream����ʽ���������ϣ��Լ���
 */
public class Demo02List {
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		list.add("���޼�");
		list.add("������");
		list.add("����ǿ");
		list.add("�˳�");
		list.add("�º�");
		
		//��list������Ԫ�ؽ��й��ˣ�ֻҪһ�����ŵ�Ԫ�أ��洢��һ���µļ�����
		//��listA���й��ˣ�ֻҪ���ֳ���Ϊ3��Ԫ��
		list.stream()
			.filter(name -> name.startsWith("��"))
			.filter(name -> name.length() == 3)
			.forEach(name -> System.out.println(name));
		
	}
}
