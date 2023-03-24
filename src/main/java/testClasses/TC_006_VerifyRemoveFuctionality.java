package testClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.CartPOM;
import pomClasses.HomePOM;
import pomClasses.LoginPOM;

public class TC_006_VerifyRemoveFuctionality extends TestBaseClass

{
	
	@Test
	public void VerifyRemove()
	{
		LoginPOM x= new LoginPOM(driver);
		x.EnterUsername();
		x.EnterPassword();
		x.PressLoginButton();
		
		HomePOM y=new HomePOM(driver);
		y.SelectAllProducts();
		
		CartPOM z= new CartPOM(driver);
		z.VerifyRemove();
		
		String ExpectedProducts ="";
		String ActualProducts = y.ItemsCountInCart();
		System.out.println(ActualProducts);
		Assert.assertEquals(ActualProducts, ExpectedProducts);
	}

}
