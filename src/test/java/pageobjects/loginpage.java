package pageobjects;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class loginpage extends BaseClass{
	
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	public WebElement login_btn;
	
	@FindBy(xpath="//input[@id='Email']")
	public WebElement email_btn;
	
	@FindBy(xpath="//input[@id='Password']")
	public WebElement pswd_btn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	public WebElement frgtpswd_lnk;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	public WebElement login;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	public WebElement logout_btn;
	
	@FindBy(xpath="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
	public WebElement errortext;
	
	public loginpage() {
		PageFactory.initElements(driver,this);
	}
		
	
	
	
	public void loginwithvalidcredentials() {
		
		login_btn.click();
		email_btn.sendKeys("seo123@gmail.com");
		 pswd_btn.sendKeys("seo@123");
		 login.click();
		
	}
	
	public boolean validatelogin() {
		return logout_btn.isDisplayed();
	}
	
	
public void loginwithinvalidcredentials() {
		
		login_btn.click();
		email_btn.sendKeys("srini324@gmail.com");
		 pswd_btn.sendKeys("srin@423");
		 login.click();
		
	}


public boolean invalidlogin() {
	return errortext.isDisplayed();
}
	
}
