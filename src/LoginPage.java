import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.selenium.constants.ConstatsFile;

import SeleniumBrower.setup.com.DriverSetup;

public class LoginPage {

	static Properties prop;
	static WebDriver driver;
	static PageFactoryExample pg;

	public static void main(String[] args) throws IOException, InterruptedException {

		DriverSetup setup = new DriverSetup();
		prop = setup.init_Properties(ConstatsFile.PATH.toString());
		try {
			driver = setup.setupBrowser("Chrome", prop.getProperty("web.server.url").toString(), prop);

		} catch (IOException e) {
			e.printStackTrace();
		}
		pg = new PageFactoryExample(driver);
		
		Thread.sleep(3000);
		pg.getUsername().sendKeys("admin");
		//setup.tearDown();

	}

}
