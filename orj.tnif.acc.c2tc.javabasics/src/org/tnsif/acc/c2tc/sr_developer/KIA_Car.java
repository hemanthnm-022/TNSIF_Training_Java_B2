package org.tnsif.acc.c2tc.sr_developer;




public class KIA_Car {
	
	 void disp_airbags()
	{
		System.out.println("All KIA have Airbag 2");
	}
	
	 void disp_speedlimit()
	{
		System.out.println("All KIA have SpeedLimit");
	}
	

	public static void main(String[] args) {
		KIA_Car speedlimit=new KIA_Car();
		 speedlimit.disp_speedlimit();
		 KIA_Car bag=new KIA_Car();
		 bag.disp_airbags();
		// TODO Auto-generated method stub

	}

}
