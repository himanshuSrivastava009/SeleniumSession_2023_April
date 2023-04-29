package FilrLoginPage.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pagefacotry.com.pageFacotryExample;

public class FilrLoginPage {
	static pageFacotryExample pg;
	
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://blr8-100-131.apac.novell.com:8443");
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		pg = new pageFacotryExample(driver);
		driver.manage().deleteAllCookies();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(pg.getUsername()));
		driver.manage().window().maximize();
		

		pg.getUsername().sendKeys("admin");
		pg.getPassword().sendKeys("novell");
		
		
	}

}
