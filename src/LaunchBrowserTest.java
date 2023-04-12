import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserTest {

	void test() {
		
	}
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://blr8-100-131.apac.novell.com:8443");
		
		

	}

}
