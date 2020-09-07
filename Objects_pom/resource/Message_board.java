package resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Message_board {
	WebDriver driver;
	public Message_board(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='spark-carousel__item ng-scope selected']")
	WebElement msg_popup;
	
	@FindBy(xpath="//button[@class='spark-btn spark-btn--xs spark-btn--negative message-exit-button ng-binding']")
	WebElement exit;
	@FindBy(xpath="//div[@class='spark-modal__content employee-message-popup-data']//div[@class='spark-modal__body']")
	WebElement Employee_id;
	
	@FindBy(xpath="//button[@class='ng-binding login-as-employee']")
	WebElement LoginAsEmployee;
	
	
	/*@FindBy(xpath="//div[text()='AA Demo']")
	WebElement lblDemo;
	
	public WebElement LabelDemo()
	{
		return lblDemo;
	}*/
	
	public WebElement Emp_id()
	{
		return Employee_id;
	}
	public WebElement LoginAsEmp()
	{
		return LoginAsEmployee;
	}
	
	public WebElement message_popup()
	{
		return msg_popup;
	}
	public WebElement Exit()
	{
		return exit;
	}
	

}
