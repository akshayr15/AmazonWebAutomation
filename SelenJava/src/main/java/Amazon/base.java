package Amazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Return;

import org.openqa.selenium.WebDriver;

public class base {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\SelenJava\\src\\main\\java\\Amazon\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\SelenJava\\drivers\\chromedriver\\chromedriver.exe");
					    driver = new ChromeDriver();
					    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
					   
		}
		else if(browserName.equals("firefox")) {
			
		}
		else if(browserName.equals("IE")) {
			
		}
	return driver;
		
	}

}
