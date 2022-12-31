package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.SkillaryDemologin;
import pomPages.SkillaryLogin;
import pomPages.Testing;

public class TestCase2 extends StepGroup {
 
	@Test
	public void tc2() throws IOException {
		SkillaryLogin s=new SkillaryLogin(driver);
		s.gearsButton();
		s.demoskillaryapp();
		
		SkillaryDemologin sd=new SkillaryDemologin(driver);
		driverutilities.switchTabs(driver);
		driverutilities.dropdown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
		
		Testing t=new Testing(driver);
		driverutilities.dragNdrop(driver,t.getFacebook(),t.getCart());
		
		Point loc=t.getFacebook().getLocation(); 
		int x=loc.getX();
		int y=loc.getY();
		driverutilities.scrollbar(driver, x, y);
		t.facebookicon();
	}
}
