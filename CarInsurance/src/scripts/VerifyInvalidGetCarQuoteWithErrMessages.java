package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseStartTest;
import pom.SydneyTestersQuickQuotePage1;
import pom.SydneyTestersQuickQuotePage2;

public class VerifyInvalidGetCarQuoteWithErrMessages extends BaseStartTest {

	@Test(priority = 1)
	public void testVerifyInvalidYearErrMessage() throws InterruptedException{

		SoftAssert s = new SoftAssert();

		Reporter.log("Test case 2 has begun for Invalid case check with Year Error message validation",true);

		// First Page
		SydneyTestersQuickQuotePage1 STQP1 = new SydneyTestersQuickQuotePage1(driver);

		STQP1.clickgetCarQuoteButton();
		Thread.sleep(2000);

		// Second Page
		SydneyTestersQuickQuotePage2 STQP2 = new SydneyTestersQuickQuotePage2(driver);

		String year = STQP2.setAndGetYear("abc"); // Enter Year of car here
		Thread.sleep(2000);
		STQP2.verifyYearErrMsg2(s);				
		Thread.sleep(2000);

		Reporter.log("Year of Car = "+ year,true);
		Reporter.log("Incorrect value entered hence, Get Quote button was not enabled and as well Car Insurance Quote will not be generated.",true);
		Reporter.log("Test case 2 has completed execution, you can also check Console for output",true);

		s.assertAll();	
	}

	@Test(priority = 2)
	public void testVerifyInvalidAgeErrMessage() throws InterruptedException{

		SoftAssert s = new SoftAssert();

		Reporter.log("Test case 3 has begun for Invalid case check with Age Error message validation",true);

		// First Page
		SydneyTestersQuickQuotePage1 STQP1 = new SydneyTestersQuickQuotePage1(driver);

		STQP1.clickgetCarQuoteButton();
		Thread.sleep(2000);

		// Second Page
		SydneyTestersQuickQuotePage2 STQP2 = new SydneyTestersQuickQuotePage2(driver);

		String age = STQP2.setAndGetDriversAge("rrr");  // Enter Driver's age here
		Thread.sleep(2000);
		STQP2.verifyAgeErrMsg(s);		
		Thread.sleep(2000);

		Reporter.log("Driver's Age = "+ age,true);
		Reporter.log("Incorrect value entered hence, Get Quote button was not enabled and as well Car Insurance Quote will not be generated.",true);
		Reporter.log("Test case 3 has completed execution, you can also check Console for output",true);

		s.assertAll();	
	}

	@Test(priority = 3)
	public void testVerifyInvalidEmailIDErrMessage() throws InterruptedException{

		SoftAssert s = new SoftAssert();

		Reporter.log("Test case 4 has begun for Invalid case check with Email-Id Error message validation",true);

		// First Page
		SydneyTestersQuickQuotePage1 STQP1 = new SydneyTestersQuickQuotePage1(driver);

		STQP1.clickgetCarQuoteButton();
		Thread.sleep(2000);

		// Second Page
		SydneyTestersQuickQuotePage2 STQP2 = new SydneyTestersQuickQuotePage2(driver);

		String email = STQP2.setAndGetEmail("ab");  // Enter Email-Id here
		Thread.sleep(2000);
		STQP2.verifyEmailErrMsg(s);

		Thread.sleep(2000);

		Reporter.log("Email-Id = "+ email,true);

		// Reporter.log(" Make of Car = " + make +"\n Year of Car = "+ year +"\n Driver's Age = "+ age +"\n Gender = "+ gender + "\n State = "+ state +"\n Email-Id = "+ email +"\n",true); 
		Reporter.log("Incorrect value entered hence, Get Quote button was not enabled and as well Car Insurance Quote will not be generated.",true);
		Reporter.log("Test case 4 has completed execution, you can also check Console for output",true);

		s.assertAll();		
	}

}
