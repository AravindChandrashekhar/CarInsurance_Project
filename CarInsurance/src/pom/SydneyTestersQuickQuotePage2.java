package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class SydneyTestersQuickQuotePage2 {


	public WebDriver driver;
	//Declaration

	@FindBy(id="make")
	private WebElement makeListBox;

	@FindBy(id="year")
	private WebElement yearBox;

	@FindBy(id="age")
	private WebElement ageBox;

	@FindBy(xpath = "//input[@id='male']")
	private WebElement genderRadioBox1;

	@FindBy(xpath = "//input[@id='female']")
	private WebElement genderRadioBox2;

	@FindBy(id="state")
	private WebElement stateListBox;

	@FindBy(id="email")
	private WebElement emailTestBox;

	@FindBy(id="getquote")
	private WebElement getQuoteButton;

	@FindBy(xpath = "//h3[starts-with(.,'Sydney Testers')]")
	private WebElement getText2;

	@FindBy(xpath = "//small[contains(.,'year is')]")
	private WebElement yearErrMsg1;

	@FindBy(xpath = "//small[contains(.,'The year has')]")
	private WebElement yearErrMsg2;

	@FindBy(xpath = "//small[contains(.,'The age is')]")
	private WebElement ageErrMsg;

	@FindBy(xpath = "//small[contains(.,'The email is')]")
	private WebElement emailErrMsg;


	//Initialization

	public SydneyTestersQuickQuotePage2(WebDriver driver){
		PageFactory.initElements(driver, this);
	}


	//Utilization

	public void verifyText2(){

		String actual2 = getText2.getText();

		SoftAssert sa2 = new SoftAssert();
		sa2.assertEquals(actual2, "Sydney Testers Car Insurance");
		Reporter.log("The Heading of the 2nd Page = "+actual2,true);
		sa2.assertAll();

		//Assert.assertEquals(actual, "Sydney Testers Car Insurance");
	}

	public String getMake(String make){

		Select sel1 = new Select(makeListBox);

		sel1.selectByVisibleText(make);

		return make;
	}


	public void verifyYearErrMsg1(SoftAssert sa){		
		
		try{
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(yearErrMsg1));
			Reporter.log("Year Error Message1 displayed correctly on Page2",true);
		}
		catch(Exception e){
			Reporter.log("Year Error Message1 has not displayed correctly on Page2",true);
			sa.fail();
		}
		
		//Assert.assertTrue(yearErrMsg1.isDisplayed());
	}

	public void verifyYearErrMsg2(SoftAssert sa){
		
		try{
			//WebDriverWait wait = new WebDriverWait(driver,10);
			//wait.until(ExpectedConditions.visibilityOf(yearErrMsg2));
			if(yearErrMsg2.isDisplayed())
			Reporter.log("Year Error Message2 displayed correctly on Page2",true);
		}
		catch(Exception e){
			Reporter.log("Year Error Message2 has not displayed correctly on Page2",true);
			sa.fail();
		}
		//Assert.assertTrue(yearErrMsg2.isDisplayed());
	}

	public void verifyAgeErrMsg(SoftAssert sa){

		try{
			//WebDriverWait wait = new WebDriverWait(driver,10);
			//wait.until(ExpectedConditions.visibilityOf(ageErrMsg));
			if (ageErrMsg.isDisplayed())
			Reporter.log("Age Error Message displayed correctly on Page2",true);
		}
		catch(Exception e){
			Reporter.log("Age Error Message has not displayed correctly on Page2",true);
			sa.fail();
		}
		//Assert.assertTrue(ageErrMsg.isDisplayed());
	}


	public String setAndGetYear(String year){		
		yearBox.sendKeys(year);
		return year;
	}


	public String setAndGetDriversAge(String age){		
		ageBox.sendKeys(age);
		return age;
	}


	public String clickandgetGender(String gender){

		if (gender.equalsIgnoreCase("Male")){
			genderRadioBox1.click();
			gender = genderRadioBox1.getAttribute("value");
		} else {
			genderRadioBox2.click();
			gender = genderRadioBox2.getAttribute("value");			
		}		

		return (Character.toUpperCase(gender.charAt(0)) + gender.substring(1));
	}


	public String getState(String state){

		Select sel2 = new Select(stateListBox);
		sel2.selectByVisibleText(state);
		return state;
	}


	public void verifyEmailErrMsg(SoftAssert sa){		
		try{
			//WebDriverWait wait = new WebDriverWait(driver,10);
			//wait.until(ExpectedConditions.visibilityOf(emailErrMsg));
			if(emailErrMsg.isDisplayed())
			Reporter.log("Email-Id Error Message displayed correctly on Page2",true);
		}
		catch(Exception e){
			Reporter.log("Email-Id Error Message has not displayed correctly on Page2",true);
			sa.fail();
		}		
		//Assert.assertTrue(emailErrMsg.isDisplayed());
	}


	public String setAndGetEmail(String email){		
		emailTestBox.sendKeys(email);		
		return email;		
	}


	public void clickGetQuote(){
		getQuoteButton.click();
	}

}
