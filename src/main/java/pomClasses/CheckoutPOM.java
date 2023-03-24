package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPOM 
{
	private WebDriver driver;
	
	@FindBy(id="first-name")
	private WebElement FirstName;
	
	public void enterFirstName()
	{
		FirstName.sendKeys("Trimmer");
		
	}
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement LastName;
	
	public void enterLastName()
	{
		LastName.sendKeys("Blade");
		
	}
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement Adress;
	
	public void enterPostalCode()
	{
		Adress.sendKeys("440008");
		
	}
	@FindBy(id="continue")
	WebElement Continue;
	
	public void ClickOnContinue()
	{
		Continue.click();
	}
	
	@FindBy(xpath="//span[@class='title']")
	WebElement CheckoutOverview;
	
	public String VerifyCheckoutOverview()
	{
		String Title=CheckoutOverview.getText();
		return Title;
	}
	
	public CheckoutPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="finish")
	WebElement FinishButton;
	
	public void ClickOnFinishButton()
	{
		FinishButton.click();
	}
	@FindBy(xpath="//h2[@class='complete-header']")
	WebElement LastTitle;
	
	public String VerifyThankyou()
	{
		String ActualTitle=LastTitle.getText();
		return ActualTitle;
	}

}
