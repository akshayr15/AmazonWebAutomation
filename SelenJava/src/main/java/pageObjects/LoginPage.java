package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public static WebDriver driver;
	
static By title = By.className("a-spacing-small");
static By username=By.id("ap_email");
static By cont = By.id("continue");
static By password= By.id("ap_password");
static By signin= By.id("signInSubmit");
static By sigintitle=By.id("nav-link-accountList-nav-line-1");

public static  WebElement getTitle() {
	return driver.findElement(title);
}
public static WebElement getUsername() {
	return driver.findElement(username);
}
public static WebElement getContinue() {
	return driver.findElement(cont);
}
public static WebElement getPassword() {
	return driver.findElement(password);
}
public static WebElement getSignIn() {
	return driver.findElement(signin);
}
public static WebElement getSignTitle() {
	return driver.findElement(sigintitle);
}
}
