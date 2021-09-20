package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;
public class ProductSearchObjects {
	
	public static WebDriver driver;
	public ProductSearchObjects(WebDriver driver) {
		this.driver=driver;
	}
	static By  dropbox=By.id("searchDropdownBox");
	static By productsearchbar=By.id("twotabsearchtextbox");
	static By productsearchbutton=By.id("nav-search-submit-button");
	static By productname = By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']");
	static By next=By.xpath("//a[contains(text(),'Next')]");
 
	public static WebElement getDropbox() {
		return driver.findElement(dropbox);
	}
	public static WebElement getProductSearch() {
		return driver.findElement(productsearchbar);
	}
	public static WebElement getProductSearchButton() {
		return driver.findElement(productsearchbutton);
	}
	public static WebElement getNextButton() {
		return driver.findElement(next);
	}
	public static List<WebElement> getProductName() {
		return driver.findElements(productname);
	}
}
