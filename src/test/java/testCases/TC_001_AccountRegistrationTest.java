package testCases;

import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	@Test(groups= {"regression","master"})
	public void test_account_Registration() throws InterruptedException {
	
		logger.info("***Starting TC_001_AccountRegistrationTest***");
		
		HomePage hp =new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My Account Link");;
		hp.clickOnRegister();
		logger.info("Clicked on Register Link");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("Providing the Customer Data");
		regpage.setFirstname(randomString().toUpperCase());
		regpage.setLastname(randomString().toUpperCase());
		//regpage.setEmail(randomString()+"@gmail.com");
		regpage.setEmail(rb.getString("email"));
		//regpage.setPassword(randomAlphaNumeric());
		regpage.setPassword(rb.getString("password"));
		Thread.sleep(1000);
		regpage.clickCheckBox();
		regpage.clickContinue();
		logger.info("Clicked On Continue");
		
		
	}
	
	
	

}
