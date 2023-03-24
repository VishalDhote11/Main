package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChildBrowserPopUp 
{
	
	

	
	
	@Test
	public void handlePopUp() {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles\\chromedriver.exe");
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/obj_console.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement TryYourself=driver.findElement(By.xpath("(//div[@class='w3-code notranslate jsHigh']/following-sibling::a)[1]"));
		
		
		TryYourself.click();
		List<String> allAdresses=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allAdresses.get(1));
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
	
	
	

}
