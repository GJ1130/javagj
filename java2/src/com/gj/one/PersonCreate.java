package com.gj.one;

public class PersonCreate
{
	
	public static void main(String[] args)
	{   //��PersonCreate���з���Person�е�����
		Person p1 =new Person();
		p1.setName("����");
		p1.setHeight(1.73);
		p1.setWeight(55);
		p1.sayHello();
		//����sayHallo����
		
		System.out.println(p1.getName()+",���Ϊ"+p1.getHeight()+"m"+",����Ϊ"+p1.getWeight()+"kg");
		
		Person p2 =new Person();
		p2.setName("����");
		p2.setHeight(1.80);
		p2.setWeight(65);
		p2.sayHello();
		System.out.println(p2.getName()+",���Ϊ"+p2.getHeight()+"m"+",����Ϊ"+p2.getWeight()+"kg");
		
		
	}

}
