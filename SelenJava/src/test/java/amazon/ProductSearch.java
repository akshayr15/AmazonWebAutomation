package amazon;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import javax.xml.xpath.XPathVariableResolver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By.ById;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Amazon.base;
import pageObjects.ProductSearchObjects;

public class ProductSearch {
	public WebDriver driver;
	List<WebElement> products;
	public ProductSearch(WebDriver driver) {
		this.driver=driver;
	}
	
	@Test
	public void ProdctSearch_Action() throws IOException, InterruptedException {
	ProductSearchObjects obj = new ProductSearchObjects(driver);
	Select select= new Select(ProductSearchObjects.getDropbox());
	select.selectByVisibleText("Men's Fashion");
	ProductSearchObjects.getProductSearch().sendKeys("Shoes");
	ProductSearchObjects.getProductSearchButton().click();
	products=ProductSearchObjects.getProductName();
	products.get(3).click();
	ProductAddtoCart search= new ProductAddtoCart(driver);
	search.ProdctAddToCart_Action();
/*	for(int i=0;i<products.size();i++) {
		String name= products.get(i).getText();
		System.out.println(name);
		if(name.equals("Skechers Men's Moreno Canvas Oxford Shoe")) {
			products.get(i).click();
			break;
		}*/
	}
	/*ProductSearchObjects.getNextButton().click();*/
	
	
	}
