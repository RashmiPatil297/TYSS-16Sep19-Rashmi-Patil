package com.tyss.phonesimulator.util;

import java.util.List;

import com.tyss.phonesimulator.dao.PhoneDAO;
import com.tyss.phonesimulator.dao.PhoneDAOImpl;


public class Phone {

	public Phone() {

	}

	public static PhoneDAO getPhoneDao() {
		return new PhoneDAOImpl();

	}



}
