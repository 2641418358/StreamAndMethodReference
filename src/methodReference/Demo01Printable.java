package methodReference;

public class Demo01Printable {
	//����һ����������������Printable�ӿڣ����ַ������д�ӡ
	public static void printString(Printable p) {
		p.print("HelloWorld");
	}
	public static void main(String[] args) {
		//����printString�����������Ĳ���printable��һ������ʽ�ӿڣ����Կ��Դ���lambda
		printString((s)->{
			System.out.println(s);
		});
		
		/*
		 * ������
		 * 	lambda���ʽ��Ŀ�ģ���ӡ���������ַ���
		 * 	�Ѳ���s�����ݸ���system��out���󣬵���out�����еķ���println���ַ������������
		 * 	ע�⣺
		 * 		1.system.out�����Ѿ��Ǵ��ڵ�
		 * 		2.println�����Ѿ��Ǵ��ڵ�
		 * �������ǿ���ʹ�÷����������Ż�lambda���ʽ
		 * ����ʹ��system.ou't����ֱ�����ã����ã�println����
		 */
		printString(System.out :: println);
	}
}
