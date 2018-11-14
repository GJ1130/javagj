package com.gj.one;

public class PersonCreate
{
	
	public static void main(String[] args)
	{   //在PersonCreate类中访问Person中的属性
		Person p1 =new Person();
		p1.setName("张三");
		p1.setHeight(1.73);
		p1.setWeight(55);
		p1.sayHello();
		//调用sayHallo方法
		
		System.out.println(p1.getName()+",身高为"+p1.getHeight()+"m"+",体重为"+p1.getWeight()+"kg");
		
		Person p2 =new Person();
		p2.setName("李四");
		p2.setHeight(1.80);
		p2.setWeight(65);
		p2.sayHello();
		System.out.println(p2.getName()+",身高为"+p2.getHeight()+"m"+",体重为"+p2.getWeight()+"kg");
		
		
	}

}
