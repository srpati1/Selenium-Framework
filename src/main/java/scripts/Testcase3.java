package scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.TrainingPage;

public class Testcase3 extends BaseClass{

	
	@Test
	public void tc3() throws InterruptedException, IOException
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		//s.searchforcourses();
		s.searchforcourses(p.getPropertyFiledata("name"));
		s.Searchbutton();
		
		CoreJavaPage c= new CoreJavaPage(driver);
		c.corejavatabblock();
		
		TrainingPage tp= new TrainingPage(driver);
		tp.cookieacceptbtn();
		driverutilities.switchFrames(driver);
		tp.playbutton();
		Thread.sleep(5000);
		tp.pausebutton();
		driverutilities.switchbackframe(driver);
		Thread.sleep(3000);
		tp.wishlistbutton();
		
	}
}
