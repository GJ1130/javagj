public class Four
{ // 数值
	int a = 20;
	// 名字
	String name;

	// void show(int a){
	// a=30;
	// }
	void show(int a) // a=10
	{
		this.a = a;
	}

	void show(Four f)
	{
		f.a = 30;

	}

	void show(Four f, Four f1)// f f1
	{
		f1 = f;
		f.a = 50;

	}

	// main方法入口 按顺序执行
	public static void main(String[] args)
	{
		int a = 10;
		Four f = new Four();
		System.out.println(f.a + "," + f.name + "," + a);// 20 null 10

//		f.show(a);
//		System.out.println(a);// 10
//		System.out.println(f.a);// 20

		 f.show(a);
		 System.out.println(a);//10
		 System.out.println(f.a);//10
		 //就近原则
		 f.show(f.a);
		 System.out.println(a);//10
		 System.out.println(f.a);//10
		 //必须先创建这个类的对象才能访问实例变量

		// f.show(f);
		// System.out.println(a);// 10
		// System.out.println(f.a);// 30

		Four f1 = new Four();
		f.show(f, f1);
		System.out.println(a);// 10
		System.out.println(f.a + "," + f1.a);

	}

}
