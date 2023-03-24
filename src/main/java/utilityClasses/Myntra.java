package utilityClasses;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\DriverFiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Searchbar=driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		Searchbar.click();
		Searchbar.sendKeys("plants");
		Searchbar.sendKeys(Keys.ENTER);
		
		WebElement SixthElement=driver.findElement(By.xpath("(//div[@class='product-sliderContainer'])[6]"));
		SixthElement.click();
		
		java.util.List <String> windoww= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windoww.get(1));
		
		WebElement addtocart=driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
		addtocart.click();
		
		WebElement Cart =driver.findElement(By.xpath("//a[@class='desktop-cart']"));
		Cart.click();
		
		WebElement removeProduct= driver.findElement(By.xpath("//button[text()='REMOVE']"));
		removeProduct.click();
	}

}
