package demo05.ObjectMethodReference;
/*
 * ͨ�����������ó�Ա����
 * ʹ��ǰ���Ƕ������Ѿ����ڣ���Ա����Ҳ���Ѿ�����
 * �Ϳ���ʹ�ö����������ó�Ա����
 */
public class Demo01ObjectMethodReference {
	//����һ�������������Ĳ�������Printable�ӿ�
	public static void printString(Printable p) {
		p.print("hello");
	}
	public static void main(String[] args) {
		//����printString�����������Ĳ���Printable��һ������ʽ�ӿڣ����Կ��Դ���lambda���ʽ
		printString((s) -> {
			//����MethodReferenceObject����
			MethodReferenceObject obj = new MethodReferenceObject();
			//����MethodReferenceObject�����г�Ա����printUpperCaseString,�������д���
			obj.printUpperCaseString(s);
		});
		/*
		 * ʹ�÷����������Ż�
		 * �����Ѿ�����
		 * ��Ա����Ҳ�Ѿ�����
		 * ����ʹ�ö��������ö��󷽷�
		 */
		MethodReferenceObject obj = new MethodReferenceObject();
		printString(obj :: printUpperCaseString);
		
		
	}
}
