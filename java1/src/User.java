public class User
{

	User()
	{
		System.out.println("���ǹ��캯��");
	}

	public void show()
	{
		System.out.println("����ʵ������show()");
	}

	// ����һ������ 1.����������ִ�У����캯����ִ�� 2.���������飩�������Ŷ���Ĵ���������ִ��
	{
		System.out.println("��������1");
	}
	{
		System.out.println("��������2");
	}
	// ��̬���������ִ�У�����ִֻ��һ��  ����Ҫ����
	static
	{
		System.out.println("��̬�����");
	}

	public static void check()
	{
		System.out.println("���Ǿ�̬����check()");
	}

	public static void main(String[] args)
	{
		// main��������� ����˳��ִ��

		User u1 = new User();

	}
}
