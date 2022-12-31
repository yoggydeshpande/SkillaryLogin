package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryDemologin {
  @FindBy(id="course")
  private WebElement coursetab;
  
  @FindBy (xpath="//a[text()='Selenium Training']")
  private WebElement seleniumtraining;
  
  @FindBy (name="addresstype")
  private WebElement coursedd;
  
  public SkillaryDemologin(WebDriver driver) {
	  PageFactory.initElements(driver,this);
  }
  
  
  public WebElement getCoursedd() {
	return coursedd;
}


public WebElement getCoursetab() {
	return coursetab;
}

public void seleniumtrainingbtn()
  {
	  seleniumtraining.click();
  }
  
}
