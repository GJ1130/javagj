public class Two
{

	// public int add(int a){
	// return a;
	// }
	public int add(int a, int b)
	{
		return a + b;

	}

	public String add(int a, String b)
	{
		return a + b;
	}

	public static int change()
	{
		return 10;
	}

	public static void change(int a)
	{
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		Two t = new Two();
		int c = t.add(10, 20);
		System.out.println(c);
		System.out.println("----------");
		String c1 = t.add(10, "20");
		System.out.println(c1);

		Two.change();
		Two.change(10);

	}

}
