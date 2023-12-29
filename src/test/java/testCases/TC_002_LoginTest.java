package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {

	@Test(groups= {"sanity","master"})
	public void testLogin() {
		
         try {
        	 
			logger.info("*** Starting TC_002_LoginTest***");

			HomePage hp= new HomePage(driver);
			hp.clickMyAccount();
			logger.info("***Clicked on My Account***");
			
			hp.clickOnLogin();
			logger.info("***Clicked on Login Link***");
			
			LoginPage lp=new LoginPage(driver);
			logger.info("***Providing the User Login Details***");
			
			lp.setEmail(rb.getString("email"));
			lp.setPassword(rb.getString("password"));
			lp.clickOnLogin();
			logger.info("***Clicked on Login button***");
			
			Thread.sleep(6000);
			

			MyAccountPage macc= new MyAccountPage(driver);
			boolean targetpage=macc.isMyAccountExists();
			Assert.assertEquals(targetpage, true,"Invalid Login Data ");
		}
		
		catch(Exception e) {
			Assert.fail();
		}
	
	logger.info("*** Finished TC_002_LoginTest ***");
		
	}
}
