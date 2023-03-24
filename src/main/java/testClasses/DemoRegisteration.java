package testClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoRegisteration {
	static WebDriver driver;

	@BeforeTest
	public void setupTest() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./DriverFiles\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		
		
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("initialise");
	}


	@Test(dataProvider="ExcelData", dataProviderClass = DemoRegData.class)
	public void register(String FirstNameT,String LastNameT,String StreetAddressT,String ApartmentT,String CityT,String StateT,String PostalT,String CountryT,String EmailT,String DemoDateT,String ConvinientTimeHH,String ConvinientTimeMM,String Contact,String query) throws IOException {
System.out.println("driver="+driver);
		DemoRegiPOM x = new DemoRegiPOM(driver);
		x.enterFirstName(FirstNameT);
		x.enterLastName(LastNameT);
		x.enterStreetAddress(StreetAddressT);
		x.enterApartment(ApartmentT);
		x.enterCity(CityT);
		x.enterState(StateT);
		x.enterPostal(PostalT);
		x.SelectData(x.Country, CountryT);
		x.enterEmail(EmailT);
		x.enterDemoDate(DemoDateT);
		x.SelectData(x.TimeHH, ConvinientTimeHH);
		x.SelectData(x.TimeMM, ConvinientTimeMM);
		x.clickOnCourseType();
		x.enterMobileNumber(Contact);
		x.sendQuery(query);
		x.enterVerificationCode();
		
		
		System.out.println(FirstNameT+LastNameT+StreetAddressT+ApartmentT+CityT+StateT);
		
	}
	@AfterClass
	public void tearsDown()
	{
	
		driver.quit();
	}
	

}
