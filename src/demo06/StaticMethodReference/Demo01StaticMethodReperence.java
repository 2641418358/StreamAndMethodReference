package demo06.StaticMethodReference;
/*
 * ͨ���������þ�̬��Ա����
 * 		���Ѿ�����
 * 		��̬��Ա����Ҳ�Ѿ�����
 * �Ϳ���ֱ��ͨ���������þ�̬��Ա����
 */
public class Demo01StaticMethodReperence {
	//����һ�������������Ĳ�������Ҫ�������ֵ�������ͺ���ʽ�ӿ�Calable
	public static int method(int number , Calable c) {
		return c.calsAbs(number);
	}
	public static void main(String[] args) {
		//����method���������ݼ������ֵ��������lambda���ʽ
		method(-10 , n -> Math.abs(n));
		/*
		 * ��������
		 * 	Math���Ѿ�����
		 * abs�������ֵ�ľ�̬����Ҳ���Ѿ�����
		 * �������ǿ���ֱ��ͨ���������þ�̬����
		 */
		int num = method(-10 , Math :: abs);
		System.out.println(num);
	}
	
}
