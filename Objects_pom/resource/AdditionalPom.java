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
 
 @FindBy(xpath="//*[@id='mainContainerDiv']/ng-view/sc-additional-requests/div/div[3]/div/div[2]/div[1]/fieldset/label/span")
WebElement date; 
 
 @FindBy(xpath="//*[@id='mainContainerDiv']/ng-view/sc-additional-requests/div/div[4]/button[1]")
 WebElement nextBtn;
 
 @FindBy(xpath="//*[@id='additional-request-summary']/div[4]/div[1]/div[2]/select")
 WebElement Selectanom;
 @FindBy(xpath="//*[@id='additional-request-summary']/div[5]/button[1]")
 WebElement submit;
 @FindBy(xpath="//*[@id='additional-request-summary']/div[5]/button[2]")
WebElement Cancel1;
 @FindBy(xpath="/*[@id='mainContainerDiv']/ng-view/sc-additional-requests/div/div[4]/button[2")
 WebElement Cancel2;
 
 
 
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
 public WebElement Date()
 {
	 date.click();
	 return date;
 }
 public WebElement nextBtn()
 {
	 nextBtn.click();
	 return nextBtn;
 }
 public WebElement Selectanomaly()
 {
	 Selectanom.click();
	 return Selectanom;
 }
 
 public WebElement submitBtn()
 {
	 submit.click();
	 return submit;
 }

 public WebElement Cancel1Btn()
 {
	 Cancel1.click();
	 return Cancel1;
 }
 public WebElement Cancel2Btn()
 {
	 Cancel2.click();
	 return Cancel2;
 }
 
}
