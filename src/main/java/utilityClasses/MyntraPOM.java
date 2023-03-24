package utilityClasses;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class MyntraPOM 
{
	WebDriver driver;
	@FindBy(xpath="//input[@class='desktop-searchBar']")
	WebElement Searchbar;
	
	public void SearchPlant()
	{
		Searchbar.click();
		Searchbar.sendKeys("plants");
		Searchbar.sendKeys(Keys.ENTER);
		
	}
	
	@FindBy(xpath="(//div[@class='product-sliderContainer'])[6]")
	WebElement SixthElement;
	
	public void SelectSixthProduct()
	{
		SixthElement.click();
	}
	
	@Test
	public void selectplant()
	{
		
				System.setProperty("webdriver.chrome.driver", "D:\\DriverFiles\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.myntra.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				SearchPlant();
				SelectSixthProduct();
	}

	}


