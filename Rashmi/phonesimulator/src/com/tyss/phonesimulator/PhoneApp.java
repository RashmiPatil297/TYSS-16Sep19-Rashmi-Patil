package com.tyss.phonesimulator;

import java.util.List;
import java.util.Scanner;

import com.tyss.phonesimulator.dao.PhoneDAO;

import com.tyss.phonesimulator.dto.MobileBean;
import com.tyss.phonesimulator.util.Phone;

public class PhoneApp {
	public static void main(String[] args) {

		System.out.println("press 1 to show all contacts");
		System.out.println("press 2 to search for contact (using name)");
		System.out.println("press 3 to operate on contact");
		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();
		switch(ch) {

		case 1 :

			PhoneDAO dao = Phone.getPhoneDao();

			List<MobileBean> result = dao.showContactNames();
			System.out.println("Contact Names: ");
			for(MobileBean bean : result) {
				System.out.println(bean.getName());
			}
			break;
		case 2 : PhoneDAO dao2 = Phone.getPhoneDao();
		String name = scn.next();
		MobileBean bean = dao2.search(name);
		if(bean != null) {
			System.out.println("Name : "+bean.getName());
			System.out.println("Number : "+bean.getNumber());
			System.out.println("Group : "+bean.getGroup());
		}else {
			System.out.println("no data found");
		}
		System.out.println("press 1 to call");
		System.out.println("press 2 to message");
		System.out.println("press 3 go back to the main menu");

		break;
		default:
			break;
		}

	}

}


