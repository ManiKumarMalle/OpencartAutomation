package testCases;

 
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProvidersUtility;

public class TC_003_LoginDataDrivenTest extends BaseClass{

	@Test(dataProvider="LoginData",dataProviderClass=DataProvidersUtility.class)

	public void test_loginDDT(String email, String password,String expected) {

		logger.info("*** Starting TC_003_LoginDataDrivenTest ***");
		//try {
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickOnLogin();

			LoginPage lp=new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(password);
			lp.clickOnLogin();

		/*	MyAccountPage macc= new MyAccountPage(driver);
			boolean targetpage=macc.isMyAccountExists();

			if(expected.equals("valid")) {
				if(targetpage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(true);
				}
				else {
					Assert.assertTrue(false);
				}
			}

			if(expected.equals("Invalid")) {
				if(targetpage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(false);
				}
				else {
					Assert.assertTrue(true);
				}

			}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("***Finished TC_003_LoginDataDrivenTest  ***");*/
	}

}
