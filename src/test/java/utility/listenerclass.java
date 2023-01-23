package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import BaseClass.BaseClass;


public class listenerclass extends extentmanager implements ITestListener {

	BaseClass base = new BaseClass();
		
		public void onTestStart(ITestResult result) {
			test = extent.createTest(result.getName());
		}

		public void onTestSuccess(ITestResult result) {
			if (result.getStatus() == ITestResult.SUCCESS) {
				test.log(Status.PASS, "Pass Test case is: " + result.getName());
			}
		}

		public void onTestFailure(ITestResult result) {
			if (result.getStatus()==ITestResult.FAILURE) {
				test.log(Status.FAIL,
						MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.GREEN));
				test.log(Status.FAIL,
						MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.LIME));
				String Path = base.screenShot(result.getName());
				test.addScreenCaptureFromPath(Path, "Screenshot is attached");
				test.fail(result.getThrowable());
			}
		}

		public void onTestSkipped(ITestResult result) {
			if (result.getStatus() == ITestResult.SKIP) {
				test.log(Status.SKIP, "Skipped Test case is: " + result.getName());
			}
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
		}

		public void onStart(ITestContext context) {
			// TODO Auto-generated method stub

		}

		public void onFinish(ITestContext context) {
			// TODO Auto-generated method stub
		}
	}

