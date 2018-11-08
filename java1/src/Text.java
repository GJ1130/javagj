
public class Text{
	//員工姓名  全局變量
	String name;
	//員工工資
	double salary;
	
	
	//通過方法來進行業務的實現
	void ranSalary()
	{ //局部變量 作用域只能作用這個方法
		double ransal=200;
		//局部變量聲明時，如果沒有賦值不會報錯
		//在使用局部變量時，局部變量一定要賦值
		salary=salary+ransal;
		
		System.out.println("這個員工的姓名"+name+"加了"+ransal+"現在的工資："+salary);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Text r1=new Text();
		r1.name="員工價";
		r1.salary=2000;
		
		r1.ranSalary();
		
		
		Text r2=new Text();
		r2.name="員工乙";
		r2.salary=2300;
		
		System.out.println(r2.name+"工資為:"+r2.salary);
		
		
		
		
		
		
	}
	
	
	
	
}
