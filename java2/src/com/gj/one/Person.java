package com.gj.one;

public class Person
{   
	//����
	private String name;
    //���
	private double height;
    //����
	private int weight;
    
	//�����sayHello����
	public void sayHello()
	{
		System.out.println("hello,my name is " + this.name);//this ��ǰ����˭���þʹ���˭
	}
    
	//������˽�����Խ��з������ã�set/get+������������ĸҪ��д��
	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public double getHeight()
	{
		return height;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public int getWeight()
	{
		return weight;
	}

}
