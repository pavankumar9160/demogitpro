package utility;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentmanager{
	
	

public static 	ExtentReports extent;
public static 	ExtentSparkReporter sparkReporter;
public static 	ExtentTest test;


	public static void extentreport() {
		
		 extent = new ExtentReports();
		 sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/ExtentReports/"+"MyReport.html");
			try {
				sparkReporter.loadXMLConfig("C:\\pavan\\automation\\nopcommerce\\Extent-config.xml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("exception is " +e.getMessage());
			}
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("reporter", "pavan kumar");
		extent.setSystemInfo("OS", "windows");
		extent.setSystemInfo("version", "2.0");
		extent.setSystemInfo("environment", "testing env");
	}

	
	
	public void capturescreenshot() {

	}
	
public static void endreport() {
	extent.flush();
}
}
