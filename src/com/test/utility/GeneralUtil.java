package com.test.utility;

import java.io.IOException;
//import java.util.ArrayList;

//import com.excel.utility.DataReader;
import com.excel.utility.XLUtility;

public class GeneralUtil {
	static XLUtility xlreader;
	public static String[][]  getDataFromExcel() throws IOException {
//		ArrayList<Object[]> data= new ArrayList<Object[]>();
		String path="E:\\Eclipse_workspace\\AboutTestNG\\src\\com\\excel\\utility\\TestData.xlsx";
		
		try {
			xlreader=new XLUtility(path);
		}catch(Exception e) {
			e.printStackTrace();
			}
		int totalRow = xlreader.getRowCount("sheet1");
		int totalcols=xlreader.getCellCount("sheet1",1 );
		String RegData[][]=new String [totalRow][totalcols];
			
		
		for(int i=1;i<=totalRow;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				RegData[i-1][j]=xlreader.getCellData("Sheet1", i, j);
			}
				
		}
		return RegData;
		

//		// Test data from Excel using Parameterization
//
//		for (int rowNum = 2; rowNum <= totalRow; rowNum++) {
//
//			String firstName = xlreader.getCellData("TestData", "firstname", rowNum);
//
//			String lastName = xlreader.getCellData("TestData", "lastname", rowNum);
//			
//			String Address = xlreader.getCellData("TestData", "Address", rowNum);
//
//			String email = xlreader.getCellData("TestData", "Email", rowNum);
//
//			String phoneNumber = xlreader.getCellData("TestData", "phoneno", rowNum);
//			
//			String Gender = xlreader.getCellData("TestData", "gender", rowNum);
//			
//			String Country = xlreader.getCellData("TestData", "country", rowNum);
//
//			Object obj[]= {firstName,lastName,Address,email,phoneNumber,Gender,Country};
//			data.add(obj);
//	}
//		return data;
}

}
