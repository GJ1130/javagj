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
		
		System.out.println(this.name+"ѧ��������Ϊ��"+this.age);
		
	}

}
