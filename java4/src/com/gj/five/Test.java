package com.gj.five;

import java.util.Scanner;

public class Test
{
	
	//�����ӿڶ���
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
		System.out.println("ϵͳΪ��ѡ�����֤��Ϊ��"+bb.creatCode());
	}
	
	public static void main(String[] args)
	{
		System.out.println("�����û������ټ�λ����֤�룿");
		 Scanner s =new Scanner(System.in);
		 
		 
		 double money =s.nextDouble();
		 
		 Test t =new Test();
		 t.CheckCode(money);
		 
	}

}
