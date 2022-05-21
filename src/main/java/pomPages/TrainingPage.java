package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainingPage {
	
	@FindBy(id="gdpr-cookie-accept")
	private WebElement cookiebtn;
	
	
	@FindBy(xpath="//div[@class=\"play-icon\"]")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class=\"pause-icon\"]")
	private WebElement pausebtn;
	
	/*public WebElement getPlaybtn() {
		return playbtn;
	}*/
	
	@FindBy(xpath="//a[@data-cid=\"708\"]")
	private WebElement wishlistbtn;

	public TrainingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void cookieacceptbtn()
	{
		cookiebtn.click();
	}
	
	public void playbutton()
	{
		playbtn.click();
	}
	
	public void pausebutton()
	{
		pausebtn.click();
	}
    
	public void wishlistbutton()
	{
		wishlistbtn.click();
	}
}
