package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Amazon.base;

import org.openqa.selenium.By;

public class LandingPage {

	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	By signin=By.id("nav-link-accountList");
	
	public WebElement getSignIn() {
		return driver.findElement(signin);
	}

}
