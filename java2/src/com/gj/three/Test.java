package com.gj.three;

public class Test
{
	
	public static void main(String[] args)
	{
		//抽象类不能实例化
		//抽象类是一定依赖子类完成实例化
		Base base=new Son();
		
		base =new Gril();
		
		//抽象类的作用就是为了， 增强继承，动态绑定，多态（方法重写）
		base.check();
	}

}
