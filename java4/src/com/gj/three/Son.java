package com.gj.three;

public class Son extends Base
{

	
	//子类的构造函数依赖父类的构造
	public Son(){
		
		super(2);
	}
	
	@Override
	public void check()
	{
		// TODO Auto-generated method stub
		
		System.out.println("这是Son的check方法");
		
	}
	

}
