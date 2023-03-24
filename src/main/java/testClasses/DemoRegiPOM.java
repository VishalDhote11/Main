package testClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoRegiPOM 
{
   private WebDriver driver;
   Select s;
   
   public void SelectData(WebElement element, String value)
   {
	   Select select=new Select(element);
		select.selectByValue(value);
   }
	
	@FindBy(xpath="//input[@id='vfb-5']")
	private WebElement FirstName;
	
	public void enterFirstName(String FirstnameT)
	{
		FirstName.click();
		FirstName.sendKeys(FirstnameT);
	}
	
	@FindBy(xpath="//input[@id='vfb-7']")
	private WebElement LastName;
	
	public void enterLastName(String LastnameT)
	{
		LastName.sendKeys(LastnameT);
		
	}

	@FindBy(xpath="//input[@id='vfb-31-1']")
	private	WebElement Gender;
	
	public void MaleGender(String FirstnameT)
	{
		Gender.click();
	}
	
	@FindBy(xpath="//input[@id='vfb-13-address']")
	private WebElement StreetAddress;
	
	public void enterStreetAddress(String StreetAddressT)
	{
		StreetAddress.sendKeys(StreetAddressT);
	}
	
	@FindBy(xpath="//input[@id='vfb-13-address-2']")
	private WebElement Apartment;
	
	public void enterApartment(String ApartmentT)
	{
		Apartment.sendKeys(ApartmentT);
	}
	
	@FindBy(xpath="//input[@id='vfb-13-city']")
	private WebElement City;
	
	public void enterCity(String CityT)
	{
		City.sendKeys(CityT);
	}
	
	@FindBy(xpath="//input[@id='vfb-13-zip']")
	private WebElement Postal;
	
	public void enterPostal(String PostalT)
	{
		Postal.sendKeys(PostalT);
	}
	
	@FindBy(xpath="//input[@id='vfb-13-state']")
	private WebElement State;
	
	public void enterState(String StateT)
	{
		State.sendKeys(StateT);
	}
	
	@FindBy(xpath="//input[@id='vfb-14']")
	private WebElement Email;
	
	public void enterEmail(String EmailT)
	{
		Email.sendKeys(EmailT);
	}
	
	@FindBy(xpath="//input[@id='vfb-18']")
	private WebElement DemoDate;
	
	public void enterDemoDate(String DemoDateT)
	{
		DemoDate.sendKeys(DemoDateT+Keys.ENTER);
	}
	
	@FindBy(xpath="//select[@id='vfb-13-country']")
	public WebElement Country;
	
	@FindBy(xpath="//select[@id='vfb-16-hour']")
	public WebElement TimeHH;
	
	@FindBy(xpath="//select[@id='vfb-16-min']")
	public WebElement TimeMM;
	
	@FindBy(xpath="//*[text()='Mobile Number ']/following-sibling::input")
	private WebElement Contact;
	
	public void enterMobileNumber(String mobileNumber)
	{
		Contact.sendKeys(mobileNumber);
	}
	
	@FindBy(xpath="//*[contains(text(),'Example:')]")
	private WebElement captchtext;
	
	@FindBy(xpath="//*[contains(text(),'Example:')]/preceding-sibling::input")
	private WebElement verificationBox;
	
	public void enterVerificationCode()
	{
		String verificationText=captchtext.getText();
		String[] a=verificationText.split(" ");
		
		verificationBox.sendKeys(a[1]);
	}
	
	@FindBy(xpath="//*[text()='Selenium WebDriver']/preceding-sibling::input")
	private WebElement SeleniumWebDriver;
	
	public void clickOnCourseType()
	{
		SeleniumWebDriver.click();
	}
	
	@FindBy(xpath="//*[@id='vfb-23']/parent::div")
	private WebElement EnterQuery;
	
	public void sendQuery(String query)
	{
		EnterQuery.sendKeys(query);
	}
	
	public DemoRegiPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
