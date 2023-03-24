package utilityClasses;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exc 
{
	public static void main(String[] args) throws IOException 
	{
		String Path="C:\\Users\\prasha\\Desktop\\log.xlsx";
		FileInputStream File =new FileInputStream(Path);
		XSSFWorkbook wb=new XSSFWorkbook(File);
		int rowCount=wb.getSheet("Sheet1").getLastRowNum();
		int cellCount = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		
		
		for(int i=0;i<cellCount;i++)
		{
			Object result = null;
		XSSFCell celldata =wb.getSheet("Sheet1").getRow(0).getCell(i);
		int celltype= celldata.getCellType();
		
		
		if(celltype==1)
		{
			result = celldata.getStringCellValue();
		}
		else if(celltype==0)
		{
			result= celldata.getNumericCellValue();
		}
		else
		{
			result = celldata.getBooleanCellValue(); 
		}
		System.out.println(result);
		
		}
		
		
		
		
	}

}
