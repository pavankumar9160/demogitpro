package Testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import pageobjects.loginpage;

public class loginpagetest extends BaseClass{
	
	loginpage loginpage;
	
	@Test(priority=1)
	public void loginwithvalidcredentialstest() {
		
		 loginpage = new loginpage();
		 loginpage.loginwithvalidcredentials();
		Assert.assertTrue(loginpage.validatelogin(),"LOGIN SUCCESSFUL");
		
	}
	@Test(priority=2)
	public void loginwithinvalidcredentialstest() {
		
		 loginpage = new loginpage();
		 loginpage.loginwithinvalidcredentials();
		Assert.assertTrue(loginpage.invalidlogin(),"LOGIN UNSUCCESSFUL");

}
	@BeforeMethod
	public void setup() {
		LaunchApp("chrome");
	}
	@AfterMethod
public void close() {
	closeapp();
}

}
