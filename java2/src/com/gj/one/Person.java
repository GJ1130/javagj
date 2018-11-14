package com.gj.one;

public class Person
{   
	//姓名
	private String name;
    //身高
	private double height;
    //体重
	private int weight;
    
	//定义的sayHello方法
	public void sayHello()
	{
		System.out.println("hello,my name is " + this.name);//this 当前对象谁调用就代表谁
	}
    
	//对类中私有属性进行方法设置（set/get+属性名，首字母要大写）
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
