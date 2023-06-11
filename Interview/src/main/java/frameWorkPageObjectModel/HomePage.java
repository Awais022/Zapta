package frameWorkPageObjectModel;

import Abstract.Abstractclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Abstractclass {
    WebDriver driver;
    public HomePage(WebDriver driver ) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver , this );


    }

    @FindBy(xpath = "//h4[normalize-space()='Work From Anywhere']")
    WebElement workFromAnywhereText;

    @FindBy(xpath = "//h4[normalize-space()='Transparent Pricing']")
    WebElement transparentPricing;

    @FindBy(xpath = "//h4[normalize-space()='Premium Properties']")
    WebElement premiumProperties;

    @FindBy(xpath = "//a[@class='mx-auto mx-md-0']")
    WebElement findStayButton;


    public String verifyWorkFromAnywhereText() throws InterruptedException {
        Thread.sleep(3000);
        return workFromAnywhereText.getText();

    }

    public String verifyTransparentPricingText() throws InterruptedException {
        Thread.sleep(3000);
        return transparentPricing.getText();

    }

    public String verifyPremiumProperties() throws InterruptedException {
        Thread.sleep(3000);
        return premiumProperties.getText();

    }

    public String clickOnButton() throws InterruptedException {
        Thread.sleep(3000);
       return findStayButton.getAttribute("href");

    }














}
