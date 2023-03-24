package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class MultiBrowsers {
	static WebDriver driver;
	static WebDriver driver1;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https:\\www.gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println(driver.getTitle());
		
		System.setProperty("webdriver.edge.driver", "./DriverFiles\\msedgedriver.exe");
		driver1=new EdgeDriver();
		driver1.get("https:\\www.facebook.com");
		
		System.out.println(driver1.getTitle());
		driver1.close();
		
		
		System.out.println("messege  ---"+driver.getTitle());
		driver.quit();
	}

}
