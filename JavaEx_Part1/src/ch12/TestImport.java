package ch12;

import java.util.Date;

public class TestImport {//套件目的:告知編譯器取用哪個類別

	public static void main(String[] args) {
		int[] intArray = {1, 3, 2, 0};
		java.util.Arrays.sort(intArray);//類別長名稱，加入路徑名子//除了lang和所在套件不用加Import
//		Arrays.sort(intArray);
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
			
			java.sql.Date date = new java.sql.Date(i);//不同套件的同名類別
			Date date2 = new Date();//不同套件的同名類別 
					
					
					
		}
	}

}
