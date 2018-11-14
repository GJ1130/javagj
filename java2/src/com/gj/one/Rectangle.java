package com.gj.one;

public class Rectangle
{  // 矩形 的长
	int length;
	// 矩形的宽
	int width;
	// 矩形的面积
	int Area;
	// 矩形的周长
	int Per;
    //定义的一个构造函数
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
		System.out.println("长为" + length + ",宽为" + width + ",面积为" + Area
				+ ",周长为" + Per);

	}

	public static void main(String[] args)
	{   //创建一个对象 实例化对象给初始化值   
		Rectangle r1 = new Rectangle(28,10);
		r1.getArea();
		r1.getPer();
		r1.showAll();

	}
	

}
