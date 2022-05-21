package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaPage {
	
	@FindBy(xpath="(//div[@class=\"business_office\"])[2]")
	private WebElement corejavatab;
	
	public CoreJavaPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void corejavatabblock()
	{
		corejavatab.click();
	}
}
