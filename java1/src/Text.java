
public class Text{
	//�T������  ȫ��׃��
	String name;
	//�T�����Y
	double salary;
	
	
	//ͨ�^�������M�ИI�յČ��F
	void ranSalary()
	{ //�ֲ�׃�� ������ֻ�������@������
		double ransal=200;
		//�ֲ�׃�����r������]���xֵ�������e
		//��ʹ�þֲ�׃���r���ֲ�׃��һ��Ҫ�xֵ
		salary=salary+ransal;
		
		System.out.println("�@���T��������"+name+"����"+ransal+"�F�ڵĹ��Y��"+salary);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Text r1=new Text();
		r1.name="�T���r";
		r1.salary=2000;
		
		r1.ranSalary();
		
		
		Text r2=new Text();
		r2.name="�T����";
		r2.salary=2300;
		
		System.out.println(r2.name+"���Y��:"+r2.salary);
		
		
		
		
		
		
	}
	
	
	
	
}
