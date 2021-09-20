package amazon;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.xml.xpath.XPathVariableResolver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By.ById;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Amazon.base;
import pageObjects.ProductAddToCartObjects;
import pageObjects.ProductSearchObjects;
public class ProductAddtoCart {
	public WebDriver driver;
	
	public ProductAddtoCart(WebDriver driver) {
		this.driver=driver;
	}
	@Test
	public void ProdctAddToCart_Action() throws InterruptedException{
	ProductAddToCartObjects cart= new ProductAddToCartObjects(driver);
	Select s= new Select(cart.getaddtocartDropbox());
	s.selectByIndex(3);
	WebDriverWait wait = new WebDriverWait(driver,30);

    wait.until(ExpectedConditions.visibilityOfAllElements(cart.getaddtocartbutton()));
	cart.getaddtocartbutton().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.visibilityOfAllElements(cart.getaddtocarticon()));
	cart.getaddtocarticon().click();
	}
	
	@BeforeTest
	public void tear() throws IOException {
		base b= new base();
		driver = b.initializeDriver();
		
	}
}

