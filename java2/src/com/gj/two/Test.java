package com.gj.two;

public class Test
{
	
	public static void main(String[] args)
	{
		//����һ��ѧ������ ����һ���������
		Stu s=new Stu();
		System.out.println(s.getName());
		
		//���������������ֵ��Ҳ��������ת�ͣ�  ����ֱ��ת��
		Person p=s;
		System.out.println(p.getName());
		
		//����һ���������
		Person p1 =new Stu();
		//��������ำֵ������ת�ͣ�������ֱ��ת������Ҫǿ��ת����ת����������Ŀ������ ����new������ �ģ�
		Stu s1=(Stu)p1;
		System.out.println(s1.getAge());
		
		
		
		
	}	

}
