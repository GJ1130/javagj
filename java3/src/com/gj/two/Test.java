package com.gj.two;

public class Test
{
	
	public static void main(String[] args)
	{
		//创建一个学生对象 就是一个子类对象
		Stu s=new Stu();
		System.out.println(s.getName());
		
		//子类对象给父类对象赋值（也就是向上转型）  可以直接转换
		Person p=s;
		System.out.println(p.getName());
		
		//创建一个父类对象
		Person p1 =new Stu();
		//父类给子类赋值（向下转型）不可以直接转换，需要强制转换（转换的类型是目标类型 根据new来决定 的）
		Stu s1=(Stu)p1;
		System.out.println(s1.getAge());
		
		
		
		
	}	

}
