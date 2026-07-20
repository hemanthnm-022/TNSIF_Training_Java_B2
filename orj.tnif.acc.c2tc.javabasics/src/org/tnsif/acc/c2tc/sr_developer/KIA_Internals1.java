package org.tnsif.acc.c2tc.sr_developer;



public class KIA_Internals1 {
	
	private void disp_airbags()
	{
		System.out.println("All KIA have Airbag 2");
	}
	
	private void disp_speedlimit()
	{
		System.out.println("All KIA have SpeedLimit");
	}
	
	 public static void main(String[] args) {
		 KIA_Internals1 speedlimit=new KIA_Internals1();
		 speedlimit.disp_speedlimit();
		 KIA_Internals1 bag=new KIA_Internals1();
		 bag.disp_airbags();
		 
}

}
