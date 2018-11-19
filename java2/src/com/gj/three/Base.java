package com.gj.three;

public abstract class Base
{
	
	
	//静态块
	static
	{
		 
	}
	
	//父类的构造函数 完全给子类依赖
	Base (int a)
	{
		
	}
	
	
	//抽象方法是用abstract来修饰，但是没有方法体
	public abstract void check();

}
