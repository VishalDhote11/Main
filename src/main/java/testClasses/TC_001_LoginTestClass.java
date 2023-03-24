package testClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import pomClasses.LoginPOM;
import utilityClasses.Screenshot;

@Listeners(testClasses.MyListners.class)
public class TC_001_LoginTestClass extends TestBaseClass
{
	@Test
	public void login() throws IOException
	{
		LoginPOM x= new LoginPOM(driver);
		x.EnterUsername();
		x.EnterPassword();
		x.PressLoginButton();
		String Expected="Swag Labs";
		String ActualResult=driver.getTitle();
		System.out.println(Expected);
		Assert.assertEquals(ActualResult, Expected);
		
		Screenshot.ss(driver, "LoginSuccess");
	}

}
