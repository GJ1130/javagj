package com.gj.one;

public class Rectangle
{  // ���� �ĳ�
	int length;
	// ���εĿ�
	int width;
	// ���ε����
	int Area;
	// ���ε��ܳ�
	int Per;
    //�����һ�����캯��
	Rectangle(int length, int width)
	{

		this.length=length;
		this.width=width;

	}

	public int getArea()
	{
        
		  return Area=(length * width); 
	}

	public int getPer()
	{
		 
		return Per= (length + width) * 2;
	}

	public void showAll()
	{
		System.out.println("��Ϊ" + length + ",��Ϊ" + width + ",���Ϊ" + Area
				+ ",�ܳ�Ϊ" + Per);

	}

	public static void main(String[] args)
	{   //����һ������ ʵ�����������ʼ��ֵ   
		Rectangle r1 = new Rectangle(28,10);
		r1.getArea();
		r1.getPer();
		r1.showAll();

	}
	

}
