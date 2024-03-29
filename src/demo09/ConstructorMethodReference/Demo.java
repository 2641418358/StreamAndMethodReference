package demo09.ConstructorMethodReference;
/*
 * 类的构造器引用（构造方法）
 */
public class Demo {
	//定义一个方法，参数传递姓名和PersonBuilder接口，方法中通过姓名创建Person对象
	public static void printName(String name, PersonBuilder pb) {
		Person person = pb.builderPerson(name);
		System.out.println(person.getName());
	}
	public static void main(String[] args) {
		//调用printName方法，方法参数PersonBuilder接口式一个函数式接口，可以传递lambda表达式
		printName("迪丽热巴", (String name) ->{
			return new Person(name);
		});
		/*
		 * 方法引用优化
		 * 构造方法new Person(String name) 已知
		 * 创建对象已知
		 * 就可以使用Person引用new创建对象
		 */
		printName("古力娜扎", Person :: new);
	}
}
