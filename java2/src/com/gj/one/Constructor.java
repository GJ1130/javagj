package com.gj.one;

public class Constructor extends Person3// java���������ֱ�Ӽ̳�һ�������Ӽ̳ж������
{
	Constructor(String name, double height, int weight)
	{
		super("����", 1.73, 55);// super���ʸ������ṩ�Ĺ��캯��

	}

	Constructor()
	{
		super("����", 1.80, 65);
	}

	public static void main(String[] args)
	{

		Constructor c = new Constructor("����", 1.73, 55);

		c.sayHello();

		Constructor c1 = new Constructor();
		c1.sayHello();
	}
}
