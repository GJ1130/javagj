public class Three
{   //��ֵ
	int a = 10;
    //void�ĺ������÷���ֵ ����Ҫreturn�ؼ���
	void show(int a)
	{
      //a=20;
		this.a=a;
	}

	public static void main(String[] args)
	{  
		int a = 0;
		//����һ������ ��Ҫ����һ����ʼֵ
		Three t = new Three();// 10
		//System.out.println(a + "," + t.a);// 0 10
		//�ͽ�ԭ��
		//�ֲ�����ʹ��ʱ���븽��ʼֵ
		t.show(a);
		System.out.println(a);
		System.out.println(t.a);
			
		t.show(t.a);
		System.out.println(a);//0
		System.out.println(t.a);//0

	}

}
