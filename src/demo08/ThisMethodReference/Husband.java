package demo08.ThisMethodReference;
/*
 * 通过this引用本类的成员方法
 */
public class Husband {
	//定义一个买房子的方法
	public void buyHouse() {
		System.out.println("北京二环内买一套四合院");
	}
	//定义一个结婚的方法
	public void marry(Richable r) {
		r.buy();
	}
	//定义一个非常高兴的方法
	public void soHappy() {
		//marry方法中参数式Richable接口，传递lambda表达式
		marry(() -> {
			//使用this的成员方法，调用奔类买房子的方法
			this.buyHouse();
		});
		/*
		 * 使用引用来优化
		 * this已经存在
		 * buyHouse成员方法已经存在
		 */
		marry(this :: buyHouse);
	}
	public static void main(String[] args) {
		new Husband().soHappy();
	}
}
