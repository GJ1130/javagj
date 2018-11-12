public class Stutwo
{

	public static void main(String[] args)
	{

		// 在Stutwo类中访问Stuone中的属性
		Stuone n1 = new Stuone();
		n1.setName("高金");
		n1.setAge(230);

		System.out.println("姓名为：" + n1.getName() + "，年龄为：" + n1.getAge());

	}

}
