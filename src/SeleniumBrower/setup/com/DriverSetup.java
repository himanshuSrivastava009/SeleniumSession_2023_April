package SeleniumBrower.setup.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pagefacotry.com.pageFacotryExample;

public class DriverSetup {
	public WebDriver driver=null;
	

	public DriverSetup() {

	}
	
	
	public WebDriver setupBrowser(String browserName,String url,Properties prop) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", prop.get("chrome.driver.path").toString());
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("---------Provided browser is not supported, Please provide Chrome or Firefox as Browser-------Exiting");
			System.exit(1);
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("web.server.url"));
		return driver;
			
		
	}
	
	public Properties init_Properties(String filePath) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis  = new FileInputStream(filePath);
		prop.load(fis);
		return prop;
	}
	

	public void tearDown() {
		driver.quit();
	}
}
