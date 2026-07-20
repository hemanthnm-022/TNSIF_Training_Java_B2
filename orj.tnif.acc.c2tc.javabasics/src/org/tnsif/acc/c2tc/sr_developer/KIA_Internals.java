package org.tnsif.acc.c2tc.sr_developer;

import org.tnsif.acc.c2tc.jr_developer.KIA_Airbags;
import org.tnsif.acc.c2tc.jr_developer.KIA_SpeedLimit;

public class KIA_Internals{
	
	public void disp_airbags()
	{
		System.out.println("All KIA have Airbag 2");
	}
	
	public void disp_speedlimit()
	{
		System.out.println("All KIA have SpeedLimit");
	}
	
	 public static void main(String[] args) {
		 KIA_SpeedLimit speedlimit=new KIA_SpeedLimit();
		 speedlimit.disp_speedlimit();
		 KIA_Airbags bag=new KIA_Airbags();
		 bag.disp_airbags();
		 
}

}