package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM 
{
	 WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement Username;
	
	public void EnterUsername()
	{
		Username.sendKeys("standard_user");
	}
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	public void EnterPassword()
	{
		Password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement Login;
	public void PressLoginButton()
	{
		Login.click();
	}
	
	public LoginPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
