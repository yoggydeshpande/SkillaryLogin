package scripts;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomPages.Addtocart;
import pomPages.SkillaryDemologin;
import pomPages.SkillaryLogin;

public class TestCase1 extends StepGroup {

	@Test
	public void tc1() { 
	SkillaryLogin l=new SkillaryLogin(driver);
	l.gearsButton();
	l.demoskillaryapp();
	
	SkillaryDemologin sd=new SkillaryDemologin(driver);
	driverutilities.switchTabs(driver);
	driverutilities.mouseOver(driver, sd.getCoursetab());
	sd.seleniumtrainingbtn();
	
	Addtocart ad=new Addtocart(driver);
	driverutilities.doubleClick(driver, ad.getAddbtn());
	ad.addtocartbutton();
	driverutilities.alertpopup(driver);
	}
}
