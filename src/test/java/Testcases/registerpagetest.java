package Testcases;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import pageobjects.registerpage;
import utility.Dataprovider;

public class registerpagetest extends BaseClass{
	registerpage rp;
	@Test(priority=1)
public void verifyregistertest() {
	
	 rp = new registerpage();
	Assert.assertTrue(rp.verifyregister(),"register button displayed");
	
}
	@Test(priority=2)
public void enterregisterdetails() {
	rp.registerdetails();
	Assert.assertTrue(rp.validateregistration(),"registration successfull");
}	

	@BeforeClass
	public void setup() {
		LaunchApp("chrome");
	}
	@AfterClass
public void close() {
	closeapp();
}
}

