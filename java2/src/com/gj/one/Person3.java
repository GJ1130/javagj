package com.gj.one;

public class Person3
{
	// ����
	String name;
	// ���
	double height;
	// ����
	int weight;

	public void sayHello()
	{
		System.out.println("hello,my name is" + this.name + ",�����"
				+ this.height + "m" + ",������" + this.weight + "kg");
	}

	Person3(String name, double height, int weight)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;

	}

}
