package com.gj.one;

public class One
{
	// 数值
	int a;
	// 姓名
	String name;

	static
	{
		System.out.println("父类静态块");
	}
	{
		System.out.println("----------构造代码块");
	}

	// 构造函数
	One(String a)
	{
		System.out.println("父类构造函数");
	}

}
