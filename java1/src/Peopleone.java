public class Peopleone
{
	public static void main(String[] args)
	{
		People p1 = new People();
		p1.setName("¸ß½ð");
		p1.setsleepTime(6);
		People.sleep();
		System.out.println(p1.getName()+p1.getsleepTime());
		
		System.out.println("-------------");
		
		
		People p2 = new People();
		p2.setName("¼Ö´ºÀ×");
		p2.setsleepTime(8);
		People.sleep();
		System.out.println(p2.getName()+p2.getsleepTime());


	}

}
