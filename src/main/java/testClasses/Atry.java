package testClasses;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class Atry 
{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		WebElement Country=driver.findElement(By.xpath("//select[@id='vfb-13-country']"));
		
		
//		Thread.sleep(30000);
//		Country.click();
		   Select s= new Select(Country);
		   
		   s.selectByValue("India");
	}

}
