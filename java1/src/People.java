public class People
{
	// ����
	String name;

	int sleepTime;

	public static void sleep()
	{
		// ��̬����Ҳ�����෽��
		System.out.println("����Ҫ˯��");
	}

	public void setsleepTime(int sleepTime)
	{

		if (sleepTime >= 7)
		{
			System.out.println("˯�߳���");
		} else
		{
			System.out.println("˯�߲���");
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
