package pageobjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class registerpage extends BaseClass {
	
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	public WebElement register_btn;
	
	@FindBy(xpath="//input[@id='gender-male']")
	public WebElement gender;
	
	@FindBy(xpath="//input[@id='FirstName']")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@id='LastName']")
	public WebElement lastname;
	
	@FindBy(xpath="//input[@id='Email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='Company']")
	public WebElement companyname;
	
	@FindBy(xpath="//input[@id='Password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	public WebElement confirmpassword;

	@FindBy(xpath="//button[@id='register-button']")
	public WebElement reg_btn;

	@FindBy(xpath="//div[contains(text(),'Your registration completed')]")
	public WebElement register_text;
	
	
	public registerpage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public boolean verifyregister() {
		return register_btn.isDisplayed();
	

	}
	public void registerdetails() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		register_btn.click();
		gender.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		firstname.sendKeys("kiran");
		lastname.sendKeys("kumar");
		email.sendKeys("srin24254@gmail.com");
		companyname.sendKeys("gns info tech");
		password.sendKeys("srin65@423");
		confirmpassword.sendKeys("srin65@423");
		reg_btn.click();
	}
	
	public boolean validateregistration() {
	return 	register_text.isDisplayed();
	}	
		
		
		
		
	}


	


