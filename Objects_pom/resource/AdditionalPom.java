package resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdditionalPom {
	public	WebDriver driver;

 public AdditionalPom(WebDriver driver) {
		// TODO Auto-generated constructor stub
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	}

 @FindBy(xpath="//i[@class='spark-icon spark-icon--md']")
 WebElement Action_Button;
 @FindBy(xpath="//*[@id='panel__content']/div[3]/div/button")
 WebElement Add_menu;
 
 
 
 public WebElement Action_button()
 {
	 Action_Button.click();
	 return Action_Button;
 }
 
 public WebElement addMenu()
 {
	 Add_menu.click();
	 return Add_menu;
 }

}
