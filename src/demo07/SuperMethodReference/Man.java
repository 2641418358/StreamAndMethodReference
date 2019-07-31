package demo07.SuperMethodReference;
/*
 * ��������
 */
public class Man extends Human{
	//������д����sayHello����
	public void sayHello() {
		System.out.println("Hello ����Man��");
	}
	//����һ��������������Greetable�ӿ�
	public void method(Greetable g) {
		g.greet();
	}
	
	public void show() {
		//����method��������Ϊ������Greetable�ӿڣ����Կ��Դ���lambda���ʽ
		
//		method(() -> { 
//			  //�����������Human 
//			  Human h = new Human(); 
//			  h.sayHello(); 
//		  });
		//��Ϊ���Ӹ����ϵ�����Դ���һ���ؼ���super���������࣬�������ǿ���ֱ��ʹ��super���ø���ĳ�Ա����
				/*
				 * method(() -> { super.sayHello(); });
				 */
		/*
		 * ʹ��super������ĳ�Ա����
		* super���Ѿ����ڵ�
		* ����ĳ�Ա����sayHelloҲ���Ѿ����ڵ�
		* ��������ֱ��ʹ��super���ø���ĳ�Ա����
		*/
		method(super :: sayHello);
	}
	
	public static void main(String[] args) {
		new Man().show();
	}
}
