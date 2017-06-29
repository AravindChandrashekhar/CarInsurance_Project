package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class SydneyTestersQuickQuotePage3 {

	//Declaration

	@FindBy(xpath = "//h3[starts-with(.,'Sydney Testers')]")
	private WebElement getText3;

	@FindBy(xpath = "//dd[contains(.,'$')]")
	private WebElement getQuoteText;

	//Initialization

	public SydneyTestersQuickQuotePage3(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	//Utilization

	public void verifyText3(){

		String actual3 = getText3.getText();
		SoftAssert sa3 = new SoftAssert();
		sa3.assertEquals(actual3, "Sydney Testers Life Insurance");
		Reporter.log("The Heading of the 3rd Page = "+actual3,true);
		sa3.assertAll();
	}


	public String getQuote(){

		String q = getQuoteText.getText();
		return q;
	}

}
