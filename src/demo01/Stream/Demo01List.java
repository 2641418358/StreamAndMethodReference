package demo01.Stream;

import java.util.ArrayList;
import java.util.List;

/*
 * �ô�ͳ�ĵķ�ʽ���������ϣ��Լ��ϵ����ݽ��й���
 */
public class Demo01List {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("���޼�");
		list.add("������");
		list.add("����ǿ");
		list.add("�˳�");
		list.add("�º�");
		//��list������Ԫ�ؽ��й��ˣ�ֻҪһ�����ŵ�Ԫ�أ��洢��һ���µļ�����
		List<String> listA = new ArrayList<String>();
		for(String str : list) {
			if(str.startsWith("��"))
				listA.add(str);
		}
		
		//��listA���й��ˣ�ֻҪ���ֳ���Ϊ3��Ԫ��
		List<String> listB = new ArrayList<String>();
		for(String str : listA) {
			if(str.length() == 3)
				listB.add(str);
		}
		
		for(String s : listB) {
			System.out.println(s);
		}
		
	}
}
