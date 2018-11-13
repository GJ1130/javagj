public class User
{

	User()
	{
		System.out.println("这是构造函数");
	}

	public void show()
	{
		System.out.println("这是实例方法show()");
	}

	// 创建一个对象 1.构造代码块先执行，构造函数再执行 2.（构造代码块）并且随着对象的创建来反复执行
	{
		System.out.println("构造代码块1");
	}
	{
		System.out.println("构造代码块2");
	}
	// 静态代码块最先执行，而且只执行一次  不需要调用
	static
	{
		System.out.println("静态代码块");
	}

	public static void check()
	{
		System.out.println("这是静态方法check()");
	}

	public static void main(String[] args)
	{
		// main方法是入口 按照顺序执行

		User u1 = new User();

	}
}
