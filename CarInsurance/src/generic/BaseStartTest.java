package generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseStartTest {

	public WebDriver driver;

	@BeforeMethod	
	public void preCondition(){

	//	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//	driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new FirefoxDriver();
			
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://sydneytesters.herokuapp.com/");
		//	WebDriverWait wait = new WebDriverWait(driver,10);
		//	wait.until(ExpectedConditions.titleContains("SydneyTesters"));

	}

	@AfterMethod
	public void postCondition(){

		driver.close();
		driver.quit(); // It is added just in case SomeTimes driver.close is not closing browser properly.
	}
}
