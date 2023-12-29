package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);

	}

	//Elements

	@FindBy(name="firstname")
	WebElement lnkFirstName;

	@FindBy(name="lastname")
	WebElement lnkLastName;

	@FindBy(name="email")
	WebElement lnkEmail;


	@FindBy(name="password")
	WebElement lnkPassword;

	@FindBy(xpath="//input[@name='agree']")
	WebElement lnkCheckbox;

	@FindBy(xpath="//button[@type='submit']")
	WebElement btnContinue;

	

	//Action Methods

	public void setFirstname(String fname) {

		lnkFirstName.sendKeys(fname);

	}


	public void setLastname(String lname) {
		lnkLastName.sendKeys(lname);
	}

	public void setEmail(String email) {
		lnkEmail.sendKeys(email);

	}

	public void setPassword(String password) {
		lnkPassword.sendKeys(password);

	}



	public void clickCheckBox() {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",  lnkCheckbox);
	}

	public void clickContinue() {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",btnContinue);

	}

}
