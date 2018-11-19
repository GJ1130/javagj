package com.gj.two;

public class Son extends Base
{
	
	public Son()
	{
		a = 6;
		b = 7;
	}

	public void add()
	{
		a += 8;
	}

	public static void add1()
	{
		b += 9;
	}

	public static void main(String[] args)
	{
		Son s = new Son();
		System.out.println(s.a+","+s.b);// 6 7
		
		Base base =s;
		System.out.println(base.a+","+base.b);// 6 7
		
		base.add();
		System.out.println(s.a+","+s.b+","+base.a+","+base.b);// 14 7 14 7
		
		
		
		base.add1();
		System.out.println(base.a+","+base.b+","+s.a+","+s.b);//14 13 14 13
		
		s.add1();
		System.out.println(base.a+","+base.b+","+s.a+","+s.b);// 14 22 14 22        
		
		
		
		

	}

}
