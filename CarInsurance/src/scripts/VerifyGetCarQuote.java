package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseStartTest;
import pom.SydneyTestersQuickQuotePage1;
import pom.SydneyTestersQuickQuotePage2;
import pom.SydneyTestersQuickQuotePage3;

public class VerifyGetCarQuote extends BaseStartTest {

	@Test

	public void testVerifyGetCarQuote() throws InterruptedException{

		Reporter.log("Test case 1 has begun for Valid case check",true);

		// First Page
		SydneyTestersQuickQuotePage1 STQP1 = new SydneyTestersQuickQuotePage1(driver);

		STQP1.verifyText1();		
		Thread.sleep(2000);

		STQP1.clickgetCarQuoteButton();		
		Thread.sleep(2000);		

		// Second Page
		SydneyTestersQuickQuotePage2 STQP2 = new SydneyTestersQuickQuotePage2(driver);

		STQP2.verifyText2();		
		Thread.sleep(1000);

		String make = STQP2.getMake("Lexus");	// Enter Make of car here	
		Thread.sleep(2000);

	    String year = STQP2.setAndGetYear("2010");	// Enter Year of car here	
		Thread.sleep(2000);

		String age = STQP2.setAndGetDriversAge("18"); // Enter Driver's age here	
		Thread.sleep(2000);

		String gender = STQP2.clickandgetGender("Female"); // Enter Gender here		
		Thread.sleep(2000);

		String state = STQP2.getState("South Australia"); // Enter State here		
		Thread.sleep(2000);

		String email = STQP2.setAndGetEmail("abc@xyz.com");	// Enter Email-Id here	
		Thread.sleep(2000);

		STQP2.clickGetQuote();		
		Thread.sleep(2000);

		// Third Page
		SydneyTestersQuickQuotePage3 STQP3 = new SydneyTestersQuickQuotePage3(driver);

		STQP3.verifyText3();		
		Thread.sleep(2000);

		String quoteAmount = STQP3.getQuote();		
		Thread.sleep(2000);

		Reporter.log(" Make of Car = " + make +"\n Year of Car = "+ year +"\n Driver's Age = "+ age +"\n Gender = "+ gender + "\n State = "+ state +"\n Email-Id = "+ email + "\nThe final Car Insurance Quote = "+quoteAmount,true); 
		Reporter.log("Test case 1 has completed execution, you can also check Console for output",true);		

	}

}
