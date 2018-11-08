
public class Stu {
	
	//成員姓名
	String name;
	//成員年齡
	byte age;
	//宿舍號
	static String ssName;
	
	public static void main(String[] args)
	{   //靜態方法可以直接使用靜態變量
		ssName="6342";
		//要訪問這個類的實例變量，首先要創建這個類的實例對象
		Stu one =new Stu();
		one.name="高金";
		one.age=19;
		System.out.println(one.ssName);
		
		Stu two =new Stu();
		two.name="賈春雷";
		two.age=20;
		System.out.println(two.ssName);
		
		one.ssName="6340";
		System.out.println(two.ssName);
		
		
		
	}
	
	
	

}
