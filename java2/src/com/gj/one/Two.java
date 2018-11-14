package com.gj.one;

public class Two extends One // java中的继承 子类可以直接继承一个父类 ，可以间接继承多个父类
{

	static
	{
		System.out.println("子类的静态块");
	}

	{
		System.out.println("构造代码块---------");
	}

	Two()
	{
		// 隐式 super() 必须在第一行
        this("2");
		System.out.println("子类构造函数");
	}
	
	Two(String a){
		 super("10");
	}

	public static void main(String[] args)
	{

		Two t = new Two();

		// 子类的构造依赖父类的构造
		// super(参数列表) 访问父类中提供的构造函数
		// this(参数列表) 访问本类中的构造函数
		// this 与 super 不能同时存在 (两个都是必须放在第一行的)
	}
}
