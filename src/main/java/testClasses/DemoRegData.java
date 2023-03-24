package testClasses;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilityClasses.ExcelProgram;

public class DemoRegData 
{
	@DataProvider(name="ExcelData")
	public static String[][] getData() throws IOException
	{
		String path="C:\\Users\\prasha\\Desktop\\log.xlsx";
		String sheet="Sheet1";
		int RowCount=ExcelProgram.getRowCount(path, sheet);
		System.out.println(RowCount);
		
		int cellCount=ExcelProgram.getCellCount(path, sheet, 0);
		System.out.println(cellCount);
		
		String[][] AllData=new String[RowCount+1][cellCount];
		
		for(int i=1;i<=RowCount;i++)
		{
			String[] data=new String[cellCount];
			for(int j=0;j<cellCount;j++)
			{
				String d=ExcelProgram.getCellData(path, sheet, i, j);
				data[j]=d;
			}
			AllData[i]=data;
			
		}
		System.out.println(AllData);
		return AllData;
	}
	
	 
	
	
	
	
	
	
	
	
	
	
}