package com.testyantra.objectclass;

public class USBPort {
	
	public static void connect(Object obj) {
		
		if (obj instanceof Pendrive) {
			Pendrive p =  (Pendrive) obj;
			p.read();
			p.write();
		}
		else if(obj instanceof Mouse) {
			Mouse m = (Mouse) obj;
			m.click();
			m.scroll();
		}
		else
		{
			System.out.println("Invalid object");
		}
	}
}
