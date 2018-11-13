public class People
{
	// 姓名
	String name;

	int sleepTime;

	public static void sleep()
	{
		// 静态方法也叫做类方法
		System.out.println("人需要睡觉");
	}

	public void setsleepTime(int sleepTime)
	{

		if (sleepTime >= 7)
		{
			System.out.println("睡眠充足");
		} else
		{
			System.out.println("睡眠不足");
		}
		this.sleepTime = sleepTime;

	}

	public int getsleepTime()
	{
		return this.sleepTime;
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
