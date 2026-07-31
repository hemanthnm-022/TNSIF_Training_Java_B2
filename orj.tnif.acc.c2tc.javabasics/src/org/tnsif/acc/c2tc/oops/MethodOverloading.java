package org.tnsif.acc.c2tc.oops;



class  person {
	
	int add(int a1, int a2) 
	{
		return a1+a2;
		
	}
	
	double add(int b1, double b2) 
	{
		return (b1+b2);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person obj= new person( );
		System.out.println(obj.add(2,2.5));

	}

}
