package demo09.ConstructorMethodReference;
/*
 * ��Ĺ��������ã����췽����
 */
public class Demo {
	//����һ����������������������PersonBuilder�ӿڣ�������ͨ����������Person����
	public static void printName(String name, PersonBuilder pb) {
		Person person = pb.builderPerson(name);
		System.out.println(person.getName());
	}
	public static void main(String[] args) {
		//����printName��������������PersonBuilder�ӿ�ʽһ������ʽ�ӿڣ����Դ���lambda���ʽ
		printName("�����Ȱ�", (String name) ->{
			return new Person(name);
		});
		/*
		 * ���������Ż�
		 * ���췽��new Person(String name) ��֪
		 * ����������֪
		 * �Ϳ���ʹ��Person����new��������
		 */
		printName("��������", Person :: new);
	}
}
