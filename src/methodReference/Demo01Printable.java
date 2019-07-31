package methodReference;

public class Demo01Printable {
	//定义一个方法，参数传递Printable接口，对字符串进行打印
	public static void printString(Printable p) {
		p.print("HelloWorld");
	}
	public static void main(String[] args) {
		//调用printString方法，方法的参数printable是一个函数式接口，所以可以传递lambda
		printString((s)->{
			System.out.println(s);
		});
		
		/*
		 * 分析：
		 * 	lambda表达式的目的，打印参数传递字符串
		 * 	把参数s，传递给了system。out对象，调用out对象中的方法println对字符串进行了输出
		 * 	注意：
		 * 		1.system.out对象已经是存在的
		 * 		2.println方法已经是存在的
		 * 所以我们可以使用方法引用来优化lambda表达式
		 * 可以使用system.ou't方法直接引用（调用）println方法
		 */
		printString(System.out :: println);
	}
}
