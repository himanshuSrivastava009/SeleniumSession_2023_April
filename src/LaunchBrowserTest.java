import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.constants.ConstatsFile;

import SeleniumBrower.setup.com.DriverSetup;
import pagefacotry.com.pageFacotryExample;

public class LaunchBrowserTest extends DriverSetup{

	static Properties prop;
	void test() {
		
	}
	public static void main(String[] args) throws IOException {
	
		DriverSetup setup = new DriverSetup();
		prop = setup.init_Properties(ConstatsFile.PATH.toString());
		try {
			WebDriver driver =setup.setupBrowser("Chrome", prop.getProperty("web.server.url").toString(),prop );

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		setup.tearDown();
	}

}
