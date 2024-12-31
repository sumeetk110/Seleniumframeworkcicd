package First.Demo1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPageTest {
	 WebDriver driver;
	    LandingPage landingPage;

	    @BeforeMethod
		@BeforeClass
	    public void setUp() {
	        // Setup WebDriver
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Navigate to the URL
	        driver.get("https://uaeqa.policybazaar.ae/term-insurance/buy-insurance/landing/");

	        // Initialize Page Object
	        landingPage = new LandingPage(driver);
	    }

	    @Test
	    public void testFormSubmission() {
	        // Interact with the form
	        landingPage.enterFullName("John Doe");
	        landingPage.enterMobileNumber("555555555");
	        landingPage.enterIncome();
	        landingPage.clickSubmit();

	        // Add assertions (if applicable)
	    }

	    @AfterMethod
		@AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


