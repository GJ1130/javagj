package com.gj.three;

public class Emp extends Person
{
	
	Emp(String name,int age)
	{
		super(name,age);
	}

	@Override
	public void check()
	{
		// TODO Auto-generated method stub
		System.out.println(this.name+"工人的年龄为："+this.age);
		
	}

}
