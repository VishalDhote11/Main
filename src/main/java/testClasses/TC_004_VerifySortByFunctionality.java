package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomClasses.HomePOM;
import pomClasses.LoginPOM;

public class TC_004_VerifySortByFunctionality extends TestBaseClass
{
	@Test
	public void sortby()
	{
		LoginPOM x =new LoginPOM(driver);
		x.EnterUsername();
		x.EnterPassword();
		x.PressLoginButton();
		
		HomePOM y=new HomePOM(driver);
		y.SortBy();
		String ExpectedStatus="Price (low to high)";
		String ActualStatus=y.VerifySort();
		System.out.println(ActualStatus);
		Assert.assertEquals(ActualStatus, ExpectedStatus);
	}

}
