package pomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOM 
{
	WebDriver driver;
	Select s;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement MenuButton;
	
	public void menubutton()
	{
		MenuButton.click();
	}
	@FindBy(xpath="//a[text()='About']")
	WebElement About;
	
	public void ClickOnAbout()
	{
		About.click();
	}
	
	@FindBy(id="logout_sidebar_link")
	WebElement Logout;
	
	public void ClickOnLogout()
	{
		Logout.click();
	}
	
	@FindBy(xpath="//button[text()='Add to cart']")
	 List <WebElement> AllProducts;
	
	public void SelectAllProducts()
	{
		for(WebElement i : AllProducts)
		{
			i.click();
		}
	}
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cart;
	
	public String ItemsCountInCart()
	{
		String Count=cart.getText();
		return Count;
	}
	
	public void ClickOnCart()
	{
		cart.click();
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement dropdown;
	
	public void SortBy()
	{
		dropdown.click();
		s= new Select(dropdown);
		s.selectByIndex(2);
	}
	@FindBy(xpath="//span[@class='active_option']")
	WebElement GetCurrentSort;
	
	public String VerifySort()
	{
		String SortStatus=GetCurrentSort.getText();
		return SortStatus;
	}
	
	
	
	
	public HomePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
