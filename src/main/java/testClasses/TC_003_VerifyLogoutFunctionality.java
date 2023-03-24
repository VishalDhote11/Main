package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.HomePOM;
import pomClasses.LoginPOM;

public class TC_003_VerifyLogoutFunctionality extends TestBaseClass
{
	
	@Test
	public void Logout()
	{
		LoginPOM x =new LoginPOM(driver);
		x.EnterUsername();
		x.EnterPassword();
		x.PressLoginButton();
		
		HomePOM y=new HomePOM(driver);
		y.menubutton();
		y.ClickOnLogout();
		
		String ExpectedResult ="Swag Labs";
		String ActualResult =driver.getTitle();
		System.out.println(ActualResult);
		Assert.assertEquals(ActualResult, ExpectedResult);
				
		
	}

}
