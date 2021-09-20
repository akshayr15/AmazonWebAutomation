package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;
public class ProductAddToCartObjects {
	public static WebDriver driver;
	public ProductAddToCartObjects(WebDriver driver) {
		this.driver=driver;
	}
	static By  dropbox=By.name("dropdown_selected_size_name");
	static By addtocartbutton=By.id("add-to-cart-button");
	static By addtocarticon=By.id("nav-cart-count-container");
	
 
	public static WebElement getaddtocartDropbox() {
		return driver.findElement(dropbox);
	}
	public static WebElement getaddtocartbutton() {
		return driver.findElement(addtocartbutton);
	}
	public static WebElement getaddtocarticon() {
		return driver.findElement(addtocarticon);
	}
	
}
