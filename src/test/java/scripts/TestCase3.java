package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.Selenium;
import pomPages.SkillaryLogin;
import pomPages.WishList;

public class TestCase3 extends StepGroup {
 
	@Test
	public void tc3() throws IOException, InterruptedException{
		SkillaryLogin s=new SkillaryLogin(driver);
		s.searchtextbox(pdata.getPropertydata("coursename"));
		s.searchbutton();
		
		Selenium se=new Selenium(driver);
		se.corejavaselenium();
		
		WishList w=new WishList(driver);
		w.closepopup();
		driverutilities.switchframe(driver);
		w.playbtn();
		Thread.sleep(10000);
		driverutilities.switchbackframe(driver);
		w.wishlist();
	}
}
