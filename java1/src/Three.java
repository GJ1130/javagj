public class Three
{   //数值
	int a = 10;
    //void的函数不用返回值 ，不要return关键字
	void show(int a)
	{
      //a=20;
		this.a=a;
	}

	public static void main(String[] args)
	{  
		int a = 0;
		//创建一个对象 需要给它一个初始值
		Three t = new Three();// 10
		//System.out.println(a + "," + t.a);// 0 10
		//就近原则
		//局部变量使用时必须附初始值
		t.show(a);
		System.out.println(a);
		System.out.println(t.a);
			
		t.show(t.a);
		System.out.println(a);//0
		System.out.println(t.a);//0

	}

}
