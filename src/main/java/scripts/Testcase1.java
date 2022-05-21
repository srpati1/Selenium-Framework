package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtoCart;
import pomPages.SkillraryDemoApplication;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass{
	
	@Test
	public void tc1() //throws InterruptedException
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoApplucation();
		
		
		SkillraryDemoApplication d = new SkillraryDemoApplication(driver);
		driverutilities.switchTabs(driver);
		driverutilities.mouseHover(driver, d.getCoursetab());
		d.seleniumtrainingtab();
		
		AddtoCart a= new AddtoCart(driver);
		driverutilities.doubleClick(driver, a.getAddbtn());
		a.addtocartbutton();
		driverutilities.alertPopup(driver);
		//Thread.sleep(3000);
	}
	

}
