//������������ 1.��װ
//1.��װ �����е����� ˽�е�����private,��������ֱ�ӷ������е�˽�еı���
//������ݵİ�ȫ��
//�����е�˽�е����Խ��з��������ã�set/get|������������ĸҪ��д��
//ͨ�����������ж����ݵķ��ʣ�ͨ���������Ƕ������ߣ����ݽ��а�ȫ����
public class Stuone
{

	// ����
	private String name;
	// ����
	private int age;
	// ������
	// ��̬���� ���������Ʋ����ڵ�����������ȫ������һ������
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
			System.out.println("���䲻�Ϸ�");
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
		// this��ʾ���ǵ�ǰ���󣬱�ʾ˭����this�ʹ���˭
		System.out.println(this.name + "�������ǣ�" + this.age);
	}

	public static void main(String[] args)
	{

		cityName = "�Ͼ���";

		Stuone n1 = new Stuone();
		n1.name = "�߽�";
		n1.age = 19;

		n1.show();
		// System.out.println(n1.name+"�������ǣ�"+n1.age+",���ڳ����ǣ�"+cityName);

	}

}
