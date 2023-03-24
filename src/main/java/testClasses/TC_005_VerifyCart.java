package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.HomePOM;
import pomClasses.LoginPOM;

public class TC_005_VerifyCart extends TestBaseClass 
{
	
	@Test
	public void sortby()
	{
		LoginPOM x=new LoginPOM(driver);
		x.EnterUsername();
		x.EnterPassword();
		x.PressLoginButton();
		
		HomePOM y=new HomePOM(driver);
		y.ClickOnCart();
		String ExpectedTitle="Swag Labs";
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	

}
}