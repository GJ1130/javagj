public class People
{
	// 姓名
	String name;

	public static void sleep()
	{
		// 静态方法也叫做类方法
		System.out.println("人需要睡觉");
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{

		return this.name;
	}

	 
}
