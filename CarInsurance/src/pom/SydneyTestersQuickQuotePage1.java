package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class SydneyTestersQuickQuotePage1 {

	//Declaration

	@FindBy(id="getcarquote")
	private WebElement getCarQuoteButtonBox;

	@FindBy(xpath = "//h3[starts-with(.,'Sydney Testers')]")
	private WebElement getText1;

	//Initialization

	public SydneyTestersQuickQuotePage1(WebDriver driver){

		PageFactory.initElements(driver, this);
	}

	//Utilization

	public void verifyText1(){

		String actual1 = getText1.getText();
		SoftAssert sa1 = new SoftAssert();
		sa1.assertEquals(actual1, "Sydney Testers Insurance");
		Reporter.log("The Heading of the 1st Page = "+actual1,true);
		sa1.assertAll();
		//Assert.assertTrue(getText1.isDisplayed());
	}


	public void clickgetCarQuoteButton(){

		getCarQuoteButtonBox.click();
	}



}
