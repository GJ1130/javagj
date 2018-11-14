package com.gj.one;

public class Constructor extends Person3// java中子类可以直接继承一个父类间接继承多个父类
{
	Constructor(String name, double height, int weight)
	{
		super("张三", 1.73, 55);// super访问父类中提供的构造函数

	}

	Constructor()
	{
		super("李四", 1.80, 65);
	}

	public static void main(String[] args)
	{

		Constructor c = new Constructor("张三", 1.73, 55);

		c.sayHello();

		Constructor c1 = new Constructor();
		c1.sayHello();
	}
}
