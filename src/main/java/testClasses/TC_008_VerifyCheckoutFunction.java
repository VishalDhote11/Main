package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.CartPOM;
import pomClasses.HomePOM;
import pomClasses.LoginPOM;

public class TC_008_VerifyCheckoutFunction extends TestBaseClass
{
	@Test
	public void  Checkout()
	{
		LoginPOM x= new LoginPOM(driver);
		x.EnterUsername();
		x.EnterPassword();
		x.PressLoginButton();
		
		HomePOM y=new HomePOM(driver);
		y.SelectAllProducts();
		y.ClickOnCart();
		
		CartPOM z= new CartPOM(driver);
		z.ClickOnCheckoutButton();
		String ExpectedTitle="Checkout: Your Information";
		String ActualTitle=z.VerifyCheckoutPage();
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}


}
