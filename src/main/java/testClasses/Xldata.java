package testClasses;

import java.io.IOException;

import utilityClasses.ExcelProgram;

public class Xldata 
{
	public static void main(String[] args) throws IOException 
	{
		String path="C:\\Users\\prasha\\Desktop\\log.xlsx";
//		
//			String data=ExcelProgram.getCellData(path, "Sheet1", 0, 2);
			String data="name";
			
		System.out.println(data);
		ExcelProgram.setCellData(path, "Sheet1", 0, 0, data);
		System.out.println("passed");
	
	}

}
