package com.gj.one;

public class Two extends One // java�еļ̳� �������ֱ�Ӽ̳�һ������ �����Լ�Ӽ̳ж������
{

	static
	{
		System.out.println("����ľ�̬��");
	}

	{
		System.out.println("��������---------");
	}

	Two()
	{
		// ��ʽ super() �����ڵ�һ��
        this("2");
		System.out.println("���๹�캯��");
	}
	
	Two(String a){
		 super("10");
	}

	public static void main(String[] args)
	{

		Two t = new Two();

		// ����Ĺ�����������Ĺ���
		// super(�����б�) ���ʸ������ṩ�Ĺ��캯��
		// this(�����б�) ���ʱ����еĹ��캯��
		// this �� super ����ͬʱ���� (�������Ǳ�����ڵ�һ�е�)
	}
}
