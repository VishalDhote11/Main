package testClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datap 
{
	@Test(dataProvider ="LoginDataProvider")
	public void usedata(Object[] username)
	{
		System.out.println(username);
	}
	
	@DataProvider(name="LoginDataProvider")
	public Object [][] getdata()
	{
		Object [][][] data= {{{"abc@gmail.com","abc"}},{{"pqr@gmsil.com","pqr"}}  };
		return data;
	}
	
}
