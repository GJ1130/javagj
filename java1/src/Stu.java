
public class Stu {
	
	//�ɆT����
	String name;
	//�ɆT���g
	byte age;
	//����̖
	static String ssName;
	
	public static void main(String[] args)
	{   //�o�B��������ֱ��ʹ���o�B׃��
		ssName="6342";
		//Ҫ�L���@��Č���׃��������Ҫ�����@��Č�������
		Stu one =new Stu();
		one.name="�߽�";
		one.age=19;
		System.out.println(one.ssName);
		
		Stu two =new Stu();
		two.name="�Z����";
		two.age=20;
		System.out.println(two.ssName);
		
		one.ssName="6340";
		System.out.println(two.ssName);
		
		
		
	}
	
	
	

}
