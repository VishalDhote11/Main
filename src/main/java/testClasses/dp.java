package testClasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dp 
{
	@Test(dataProvider="loginData")
	public void useData(String username, String pwd)
	{
		System.out.println(username+" + "+pwd);
	}
	
	@DataProvider(name="loginData")
	public Object[][] getData()
	{
		Object[][] data = {{"asc13","abc"},{"pqr13","prq"}};
		return data;
	}
	
	
}
