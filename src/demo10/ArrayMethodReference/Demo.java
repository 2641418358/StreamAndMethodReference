package demo10.ArrayMethodReference;

import java.util.Arrays;

/*
 * ����Ĺ���������
 */
public class Demo {
	//����һ�������������Ĳ������ݴ�������ĳ��Ⱥ�ArrayBuilder�ӿڣ������ڲ����ݴ��ݵĳ���ʹ��ArrayBuilder�еķ����������鲢����
	public static int[] creatArray(int length, ArrayBuilder ab) {
		return ab.builderArray(length);
	}
	public static void main(String[] args) {
		//����creatArray��������������ĳ��Ⱥ�lambda���ʽ
		int arr1[] = creatArray( 10, (int len) -> {
			//���ݳ��ȣ���������
			return new int[len];
		});
		System.out.println(arr1.length);
		/*
		 * ʹ�÷��������Ż�lambda���ʽ
		 * ��֪��������int��������
		 * �����ĳ�����֪
		 * int[] ���� new�����ݲ������ݵĳ�������������
		 */
		int [] arr2 = creatArray( 10, int[] :: new);
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2.length);
		
	}
}
