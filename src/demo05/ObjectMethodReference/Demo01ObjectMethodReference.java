package demo05.ObjectMethodReference;
/*
 * 通过对象名引用成员方法
 * 使用前提是对象名已经存在，成员方法也是已经存在
 * 就可以使用对象名来引用成员方法
 */
public class Demo01ObjectMethodReference {
	//定义一个方法，方法的参数传递Printable接口
	public static void printString(Printable p) {
		p.print("hello");
	}
	public static void main(String[] args) {
		//调用printString方法，方法的参数Printable是一个函数式接口，所以可以传递lambda表达式
		printString((s) -> {
			//创建MethodReferenceObject对象
			MethodReferenceObject obj = new MethodReferenceObject();
			//调用MethodReferenceObject对象中成员方法printUpperCaseString,把字体大写输出
			obj.printUpperCaseString(s);
		});
		/*
		 * 使用方法引用来优化
		 * 对象已经存在
		 * 成员方法也已经存在
		 * 可以使用对象名引用对象方法
		 */
		MethodReferenceObject obj = new MethodReferenceObject();
		printString(obj :: printUpperCaseString);
		
		
	}
}
