package orj.tnif.acc.c2tc.javabasics;

public class Variables {
	int price=10;
	void print()
	{
		String msg ="hello";
		System.out.println("msg");
	}
	static String message="hello students";
	
	public static void main(String [] args)
	{
		Variables obj=new Variables();
		System.out.println(obj.price);
		obj.print();
		System.out.println(message);
		
	}

}
