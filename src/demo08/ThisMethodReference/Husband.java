package demo08.ThisMethodReference;
/*
 * ͨ��this���ñ���ĳ�Ա����
 */
public class Husband {
	//����һ�����ӵķ���
	public void buyHouse() {
		System.out.println("������������һ���ĺ�Ժ");
	}
	//����һ�����ķ���
	public void marry(Richable r) {
		r.buy();
	}
	//����һ���ǳ����˵ķ���
	public void soHappy() {
		//marry�����в���ʽRichable�ӿڣ�����lambda���ʽ
		marry(() -> {
			//ʹ��this�ĳ�Ա���������ñ������ӵķ���
			this.buyHouse();
		});
		/*
		 * ʹ���������Ż�
		 * this�Ѿ�����
		 * buyHouse��Ա�����Ѿ�����
		 */
		marry(this :: buyHouse);
	}
	public static void main(String[] args) {
		new Husband().soHappy();
	}
}
