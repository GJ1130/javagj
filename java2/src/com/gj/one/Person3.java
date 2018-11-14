package com.gj.one;

public class Person3
{
	// 姓名
	String name;
	// 身高
	double height;
	// 体重
	int weight;

	public void sayHello()
	{
		System.out.println("hello,my name is" + this.name + ",身高是"
				+ this.height + "m" + ",体重是" + this.weight + "kg");
	}

	Person3(String name, double height, int weight)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;

	}

}
