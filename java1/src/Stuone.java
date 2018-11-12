//面向对象的特征 1.封装
//1.封装 对类中的属性 私有的设置private,这样不能直接访问类中的私有的变量
//提高数据的安全性
//对类中的私有的属性进行方法的设置（set/get|属性名，首字母要大写）
//通过方法来进行对数据的访问，通过方法我们对设置者，数据进行安全控制
public class Stuone
{

	// 姓名
	private String name;
	// 年龄
	private int age;
	// 城市名
	// 静态变量 ，城市名称不属于单个个体属于全体对象的一个属性
	static String cityName;

	public void setName(String name)
	{

		this.name = name;

	}

	public String getName()
	{

		return this.name;
	}

	public void setAge(int age)
	{

		if (age > 0 && age <= 150)
		{
			this.age = age;

		} else
		{
			System.out.println("年龄不合法");
		}
	}

	public int getAge()
	{
		if (age > 0 && age <= 150)
		{
			return this.age;

		} else
		{
			return 0;
		}

	}

	public void show()
	{
		// this表示的是当前对象，表示谁调用this就代表谁
		System.out.println(this.name + "，年龄是：" + this.age);
	}

	public static void main(String[] args)
	{

		cityName = "南京市";

		Stuone n1 = new Stuone();
		n1.name = "高金";
		n1.age = 19;

		n1.show();
		// System.out.println(n1.name+"，年龄是："+n1.age+",所在城市是："+cityName);

	}

}
