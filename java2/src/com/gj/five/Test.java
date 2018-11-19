package com.gj.five;

import java.util.Scanner;

public class Test
{
	
	//声明接口对象
	UserUtil bb;
	
	public void CheckCode(double money)
	{
		if(money <1000)
		{
			bb=new NumberCode();	
		}
		else
		{
			bb= new NumberAndCharCode();
		}
		System.out.println("系统为你选择的验证码为："+bb.creatCode());
	}
	
	public static void main(String[] args)
	{
		System.out.println("请问用户给多少价位的验证码？");
		 Scanner s =new Scanner(System.in);
		 
		 
		 double money =s.nextDouble();
		 
		 Test t =new Test();
		 t.CheckCode(money);
		 
	}

}
