package First.Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;

    // Constructor
    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Page Elements (use @FindBy)
    @FindBy(id = "name") // Example ID - Update based on actual DOM
    WebElement fullNameField;

    @FindBy( id= "mob-number") // Example ID
    WebElement mobileNumberField;

    @FindBy(xpath = "//div[text()='20k+']") // Example ID
    WebElement income;

    @FindBy(xpath = "//button[text()='View Plans']") // Example ID
    WebElement submitButton;

    // Actions
    public void enterFullName(String fullName) {
        fullNameField.sendKeys(fullName);
    }

    public void enterMobileNumber(String mobileNumber) {
        mobileNumberField.sendKeys(mobileNumber);
    }

    public void enterIncome() {
        income.click();
    }

    public void clickSubmit() {
        submitButton.click();
    }
}