package interView;

import TestComponents.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import frameWorkPageObjectModel.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main extends BaseTest{
	ExtentReports extent;
   
	String workFormAnywhereValidation= "Work From Anywhere";
	String transparentPricingValidation = "Transparent Pricing";
	String premiumPropertiesValidation = "Premium Properties";
	String linkValidation = "https://saucasa.zaptatech.com/index?#featured";

	String messageGet = "";




    @Test(priority = 1, description = "Verify that the Sucasa standard section contain Work From Anywhere text <br> Priority:High Severity:Low ")
    public void functionOne() throws IOException, InterruptedException {

         HomePage methods = new HomePage(driver);
		 messageGet = methods.verifyWorkFromAnywhereText();
        Assert.assertEquals(messageGet, workFormAnywhereValidation);
		driver.close();

    }

	@Test(priority = 2, description = "Verify that the Sucasa standard section contain Transparent Pricing text <br> Priority:High Severity:Low ")
	public void functionTwo() throws IOException, InterruptedException {

		HomePage methods = new HomePage(driver);
		messageGet = methods.verifyTransparentPricingText();
		Assert.assertEquals(messageGet, transparentPricingValidation);
		driver.close();

	}

	@Test(priority = 3, description = "Verify that the Sucasa standard section contain Premium Properties text <br> Priority:High Severity:Low ")
	public void functionThree() throws IOException, InterruptedException {

		HomePage methods = new HomePage(driver);
		messageGet = methods.verifyPremiumProperties();
		Assert.assertEquals(messageGet, premiumPropertiesValidation);
		driver.close();

	}

	@Test(priority = 4, description = "Verify that the link text <br> Priority:High Severity:High")
	public void functionFour() throws IOException, InterruptedException {

		HomePage methods = new HomePage(driver);
		String link = methods.clickOnButton();
		Thread.sleep(3000);
		driver.get(link);
		Thread.sleep(3000);
		String getUrl = driver.getCurrentUrl();
		Assert.assertEquals(getUrl, linkValidation);

			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String screenshotFileName = "First_[HH-MM-SS]" + System.currentTimeMillis() + ".png";
			String screenshotFilePath = "/Users/muhammadabbas/Desktop/interView/mainInterView/Interview/Interview/reports" + screenshotFileName;
			try {
				FileHandler.copy(screenshotFile, new File(screenshotFilePath));
				System.out.println("Screenshot saved: " + screenshotFilePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}













}
