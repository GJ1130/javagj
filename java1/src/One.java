public class One
{

	String name;

	// ���캯��
	// ���캯�������ã���������Խ��и�ֵ
	One()
	{
		System.out.println("û�в����Ĺ��캯��");
	}

	public One(String name)
	{
		this.name = name;
		System.out.println("�в����Ĺ��캯��");

	}

	public static void main(String[] args)
	{

		// ������캯������������ ͬһ����������ͬ��ʵ�ֽ��
		One o1 = new One();

		One o2 = new One("��");
	}
	//ʵ������  ���ǹ��췽�� ʵ������һ������
	int One(){
		return 0;
	}

}
