package amazon;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import Amazon.base;

public class air extends base {
	
@Test
public void air_bnb() throws IOException, InterruptedException {
	WebDriver driver=initializeDriver();
	driver.get("https://www.airbnb.co.in/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@data-testid='accept-btn']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@class='_1xq16jy']")).sendKeys("Auckland",Keys.ENTER);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@data-testid='datepicker-day-2021-08-23']//div[@class='_1eu9zfzy']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@data-testid='datepicker-day-2021-08-29']//div//div")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@class='_uh2dzp']")).click();
	int numberofperson=5;
	String name="adult";
	if(name=="adult") {
	for(int i=0;i<numberofperson;i++) {
	driver.findElement(By.xpath("//button[@data-testid='stepper-adults-increase-button']//span")).click();
	
	}
	}
	
	else if(name=="children") {
	for(int i=0;i<numberofperson;i++) {
		driver.findElement(By.xpath("//button[@data-testid='stepper-children-increase-button']//span")).click();
	
		}
	}
	else if(name=="infants") {
	for(int i=0;i<numberofperson;i++) {
		driver.findElement(By.xpath("//button[@data-testid='stepper-infants-increase-button']//span")).click();
		}
	}
	Thread.sleep(2000);
	driver.findElement(By.className("_w64aej")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@class='_t6p96s']//span[contains(text(),'More')]")).click();
	WebElement elements1 = driver.findElement(By.xpath("//h2[contains(text(),'Host language')]"));
	WebElement elements2 = driver.findElement(By.xpath("//h2[contains(text(),'Rooms and beds')]"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView()", elements1); 
	Thread.sleep(3000);
	jse.executeScript("arguments[0].scrollIntoView()", elements2);
	Thread.sleep(3000);
	WebElement element3=driver.findElement(By.xpath("//input[@name='English']"));
	driver.findElement(By.xpath("//button[@class='_pmpl8qu']")).click();
	Thread.sleep(3000);
	  List<WebElement> element=driver.findElements(By.xpath("//button[@class='_fwxpgr']//div//div//div")); 
	  element.get(1).click();
	  driver.findElement(By.xpath("//div[@class='_v3gzda1']")).click();
	 
	
}

}
