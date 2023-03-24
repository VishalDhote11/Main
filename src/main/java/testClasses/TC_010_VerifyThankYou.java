package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.CartPOM;
import pomClasses.CheckoutPOM;
import pomClasses.HomePOM;
import pomClasses.LoginPOM;

public class TC_010_VerifyThankYou extends TestBaseClass
{
	@Test
	public void ThankYou()
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
		
		CheckoutPOM w= new CheckoutPOM(driver);
		w.enterFirstName();
		w.enterLastName();
		w.enterPostalCode();
		w.ClickOnContinue();
		w.ClickOnFinishButton();
		String ExpectedTitle="Thank you for your order!";
		String ActualTitle=w.VerifyThankyou();
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

}
