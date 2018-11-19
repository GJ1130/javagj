package com.gj.three;

public class Stu extends Person
{
	
	Stu(String name,int age)
	{
		super(name,age);
	}

	@Override
	public void check()
	{
		// TODO Auto-generated method stub
		
		System.out.println(this.name+"学生的年龄为："+this.age);
		
	}

}
