package com.avactis.sb.qa.util;

import java.util.ArrayList;

import com.avactis.sb.qa.excel.utiliy.Xls_Reader;

public class TestUtil {

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=20;
	public static Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel() {
		
			ArrayList<Object[]> mydata = new ArrayList<Object[]>();
				
		try {
			reader = new Xls_Reader("src\\main\\java\\com\\avactis\\sb\\qa\\excel\\utiliy\\Xls_Reader.java");
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		for (int rowNum=2; rowNum <= reader.getRowCount("RegTestData"); rowNum++) {
			
			String email = reader.getCellData("RegTestData", "email", rowNum);
			String password = reader.getCellData("RegTestData", "password", rowNum);
			String firstname = reader.getCellData("RegTestData", "firstname", rowNum);
			String lastname = reader.getCellData("RegTestData", "lastname", rowNum);
			String country = reader.getCellData("RegTestData", "country", rowNum);
			String state = reader.getCellData("RegTestData", "state", rowNum);
			String zipcode = reader.getCellData("RegTestData", "zipcode", rowNum);
			String city = reader.getCellData("RegTestData", "city", rowNum);
			String address1 = reader.getCellData("RegTestData", "address1", rowNum);
			String address2 = reader.getCellData("RegTestData", "address2", rowNum);
			String contact = reader.getCellData("RegTestData", "contact", rowNum);
		
			Object ob[] = {email,password,firstname,country,state,zipcode,city,address1,address2,contact};
			mydata.add(ob);
		}
		
		return mydata;
	}
	
}
	
