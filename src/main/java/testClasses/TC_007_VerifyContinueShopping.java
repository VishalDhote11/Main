package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.CartPOM;
import pomClasses.HomePOM;
import pomClasses.LoginPOM;


public class TC_007_VerifyContinueShopping extends TestBaseClass
{
	@Test
	public void Continueshopping()
	{
		LoginPOM x= new LoginPOM(driver);
		x.EnterUsername();
		x.EnterPassword();
		x.PressLoginButton();
		
		HomePOM y=new HomePOM(driver);
		y.SelectAllProducts();
		y.ClickOnCart();
		
		CartPOM z= new CartPOM(driver);
		z.VerifyContinueShopping();
		String Expected="Swag Labs";
		String ActualResult=driver.getTitle();
		System.out.println(Expected);
		Assert.assertEquals(ActualResult, Expected);
		
	}

}
