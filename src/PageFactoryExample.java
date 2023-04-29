import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryExample {

public PageFactoryExample() {
		
		
	}
	
	@FindBy(id="username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	public PageFactoryExample(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	

	
}
