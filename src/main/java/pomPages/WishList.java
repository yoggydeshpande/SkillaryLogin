package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList {
 
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement play;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pause;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlistbtn;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement close;
	
	public WishList(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void wishlist() {
		wishlistbtn.click();
	}
	
	public void playbtn() {
		play.click();
	}
	public void closepopup() {
		close.click();
	}
	
	public void pausebtn() {
		pause.click();
	}
	
}
