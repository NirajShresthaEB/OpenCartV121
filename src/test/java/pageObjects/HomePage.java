package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		super();
	}
	
	@FindBy (xpath="//span[normalize-space='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy (xpath="//a[normalize-space='Register]")
	WebElement lnkRegister;
	
	public void clickMyAccount() {
		lnkMyAccount.click();
	}
	
	public void clickRegister() {
		lnkRegister.click();
	}

}
