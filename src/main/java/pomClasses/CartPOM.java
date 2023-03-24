package pomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPOM 
{
	WebDriver driver;
	
	@FindBy(xpath="//button[text()='Remove']")
	List<WebElement> Remove;
	
	public void VerifyRemove()
	{
		for(WebElement i : Remove)
		{
			i.click();
		}
	}
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	WebElement ContinueShoping;
	
	public void VerifyContinueShopping()
	{
		ContinueShoping.click();
	}
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;
	public void VerifyCheckout()
	{
		checkout.click();
	}
	
	@FindBy(id="checkout")
	WebElement Checkout;
	
	public void ClickOnCheckoutButton()
	{
		Checkout.click();
	}
	
	@FindBy(xpath="//span[@class='title']")
	WebElement Title;
	public String VerifyCheckoutPage()
	{
		String GetCheckoutPageTitle=Title.getText();
		return GetCheckoutPageTitle;
	}
	
	
	
	
	public CartPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
