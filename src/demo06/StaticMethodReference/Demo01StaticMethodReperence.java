package demo06.StaticMethodReference;
/*
 * 通过类名引用静态成员方法
 * 		类已经存在
 * 		静态成员方法也已经存在
 * 就可以直接通过类名引用静态成员方法
 */
public class Demo01StaticMethodReperence {
	//定义一个方法，方法的参数传递要计算绝对值的整数和函数式接口Calable
	public static int method(int number , Calable c) {
		return c.calsAbs(number);
	}
	public static void main(String[] args) {
		//调用method方法，传递计算绝对值整数，和lambda表达式
		method(-10 , n -> Math.abs(n));
		/*
		 * 方法引用
		 * 	Math类已经存在
		 * abs计算绝对值的静态方法也是已经存在
		 * 所以我们可以直接通过类名引用静态方法
		 */
		int num = method(-10 , Math :: abs);
		System.out.println(num);
	}
	
}
