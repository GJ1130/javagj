public class One
{

	String name;

	// 构造函数
	// 构造函数的作用：给类的属性进行赋值
	One()
	{
		System.out.println("没有参数的构造函数");
	}

	public One(String name)
	{
		this.name = name;
		System.out.println("有参数的构造函数");

	}

	public static void main(String[] args)
	{

		// 多个构造函数构成了重载 同一个方法名不同的实现结果
		One o1 = new One();

		One o2 = new One("高");
	}
	//实例方法  不是构造方法 实例就是一个对象
	int One(){
		return 0;
	}

}
