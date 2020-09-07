package resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class schedule_pom {
	
	WebDriver driver;
	public schedule_pom(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	
	
	@FindBy(xpath="//*[@id='cobranded']/sc-header/nav/div[1]/ul/li[1]")
	WebElement Schedule_menu;
	
	@FindBy(xpath="//button[contains(text(),'Collapse All')]")
	WebElement Collpase_button ;
	
	
	
	@FindBy(xpath="//*[@id='mainContainerDiv']/ng-view/sc-weekly-view/div/div/div[1]/div[2]")
	WebElement Date1 ;
	@FindBy(xpath="//*[@id='mainContainerDiv']/ng-view/sc-weekly-view/div/div/div[1]/div[3]/img")
	WebElement Next ;
	
	@FindBy(xpath="//*[@id='mainContainerDiv']/ng-view/sc-weekly-view/div/div/div[1]/div[1]/img")
	WebElement Prev ;
	@FindBy(xpath="//div[@class='col-xs-10 weekly-schedule-date-picker-container']/div/label[@id='weekly-schedule-start-date']//a[1]/i[1]\r\n")
	WebElement Calendar1 ;
	@FindBy(xpath="//div[@class='spark-calendar__overflow']")
	WebElement Start_date ;
	@FindBy(xpath="//a[@class='spark-calendar__day spark-calendar__range-last']\r\n")
	WebElement list1 ;
	
	
	public WebElement sch_menu()
	{
		return Schedule_menu;
	}
	
	public WebElement Collpase()
	{
		return Collpase_button;
	}
	public WebElement date()
	{
		return Date1;
	}
	
	
	public WebElement next()
	{
		return Next;
	}
	
	public WebElement prev()
	{
		return Prev;
	}
	public WebElement cal1()
	{
		return Calendar1;
	}
	
	public WebElement start_date()
	{
		return Start_date;
	}
	
	public WebElement List1()
	{
		return list1;
	}
}
