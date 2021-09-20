package amazon;
import static org.testng.Assert.assertEquals;

import java.io.Console;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Amazon.base;
import net.bytebuddy.implementation.bind.annotation.Super;
import pageObjects.LandingPage;
import pageObjects.LoginPage;


public class HomePage extends base {
	
	public WebDriver driver;
	
@Test
public void Login_Action() throws IOException, InterruptedException {
	
	LandingPage landingobj =new LandingPage(driver);
	WebDriverWait wait = new WebDriverWait(driver,30);
	landingobj.getSignIn().click();
	LoginPage loginobj= new LoginPage(driver);
	assertEquals(LoginPage.getTitle().getText(), "Sign-In");
	LoginPage.getTitle().getText();
	LoginPage.getUsername().sendKeys("akshay.hbk96@gmail.com");
	LoginPage.getContinue().click();
	LoginPage.getPassword().sendKeys("mypwd!@#");
	LoginPage.getSignIn().click();
	Assert.assertFalse(LoginPage.getSignTitle().getText().contains("Sign in"));
	ProductSearch product = new ProductSearch(driver);
	product.ProdctSearch_Action();
	
}

@BeforeTest
public void Browser_Action() throws IOException {
	driver  = initializeDriver();
	driver.get("https://www.amazon.com/");
	
	driver.manage().window().maximize();
	
}
}
