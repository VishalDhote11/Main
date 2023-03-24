package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.HomePOM;
import pomClasses.LoginPOM;

public class Tc_002_AllProducts extends TestBaseClass
{
	@Test
	public void VerifyAllProduct()
	{
		LoginPOM y= new LoginPOM(driver);
		y.EnterUsername();
		y.EnterPassword();
		y.PressLoginButton();
		
		
		HomePOM x=new HomePOM(driver);
		x.SelectAllProducts();
		String ExpectedProducts ="6";
		String ActualProducts = x.ItemsCountInCart();
		System.out.println(ActualProducts);
		Assert.assertEquals(ActualProducts, ExpectedProducts);
	}

}
