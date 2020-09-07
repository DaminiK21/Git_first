package Scratch.E2E_project;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resource.Pomobjects;
import resource.schedule_pom;

public class Schedule  extends Base_class{
	
	@BeforeTest
	public void initilize() throws IOException
	{
		driver=Intilizer();
		driver.get(prop.getProperty("url"));
		
	}
 //@Test(dataProvider="data_prov")
	
	@Test
 
// public void Schedule_screen(String user, String password) throws IOException, InterruptedException
 public void Schedule_screen() throws IOException, InterruptedException
 {
	
	 System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Pomobjects obj= new Pomobjects(driver);
		obj.username().sendKeys("225");
		obj.pass().sendKeys("1234");
		obj.button().click();
		obj.pass().sendKeys(Keys.ENTER);
		System.out.println("Login Successfully");
		
	 schedule_pom sch= new schedule_pom(driver);
	 
	
	 WebDriverWait Exp_wait= new WebDriverWait(driver,10);
	//Assert.assertFalse(sch.sch_menu().isDisplayed());
	//driver.navigate().refresh();
   Exp_wait.until(ExpectedConditions.elementToBeClickable(sch.sch_menu()));
    sch.sch_menu().click();
	
	if(sch.Collpase().isDisplayed())
	{
		for(int i=0;i<=6;i++)
			{
			System.out.println(sch.Collpase().getText());
			sch.Collpase().click();
			}
		
		System.out.println(sch.Collpase().getText());
	}
	else
		
	{
		System.out.println("Collaps Button is not available");
	}
		
	System.out.println(sch.date().getText());
	sch.next().click();
	System.out.println("Click on next button");
	
	
	System.out.println(sch.date().getText());
	sch.prev().click();
	System.out.println("Click on Previous button");

	
	System.out.println("Calendar control testing");
	sch.cal1().click();

	
WebElement start_date= sch.start_date();


/*
	List<WebElement> dates=start_date.findElements(By.xpath("//a[@class='spark-calendar__day spark-calendar__range-last']"));
	int count=start_date.findElements(By.xpath("//a[@class='spark-calendar__day spark-calendar__range-last']")).size();
	
	
	System.out.println(start_date.findElements(By.xpath("//a[@class='spark-calendar__day spark-calendar__range-last']")).size());
	for(int i=0;i<count;i++)
	{
		String day=start_date.findElements(By.xpath("//a[@class='spark-calendar__day spark-calendar__range-last']")).get(i).getText();
		
		if(day.equalsIgnoreCase("12"))
		{
			start_date.findElements(By.xpath("//a[@class='spark-calendar__day spark-calendar__range-last']")).get(i).click();
			break;
		}
	}
	Thread.sleep(4000);
	
	
	driver.findElement(By.xpath("//div[@class='col-xs-10 weekly-schedule-date-picker-container']/div/label[@id='weekly-schedule-end-date']//a[1]/i[1]")).click();
	WebElement end_date= driver.findElement(By.xpath("//div[@class='spark-calendar__overflow']"));
	
	List<WebElement> dates1=end_date.findElements(By.xpath("//a[@class='spark-calendar__day spark-calendar__range-last']"));
	int count1=end_date.findElements(By.xpath("//a[@class='spark-calendar__day spark-calendar__range-last']")).size();

	for(int i=0;i<count1;i++)
	{
		String text=end_date.findElements(By.xpath("//a[@class='spark-calendar__day spark-calendar__range-last']")).get(i).getText();
		
		if(text.equalsIgnoreCase("30"))
		{
			end_date.findElements(By.xpath("//a[@class='spark-calendar__day spark-calendar__range-last']")).get(i).click();
			break;
		}
	}
	
	driver.findElement(By.xpath("//button[@ng-click='vm.showScheduleForWeeklyView()']")).click();
	
	
	

	Thread.sleep(4000);
	
    driver.findElement(By.xpath("//div[@class='schedule-date hand-cursor']")).click();
	System.out.println("check schedule for selected day");
	
	
	Exp_wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='cobranded']/sc-header/sc-screen-header/div/nav/div[1]/div/img")));

	driver.findElement(By.xpath("//*[@id='cobranded']/sc-header/sc-screen-header/div/nav/div[1]/div/img")).click();
	System.out.println("check on home button");
	
	
	*/
 }

 /*@DataProvider
 public Object[][] data_prov()
 {
	 Object[][] obj=new Object[2][2];
	 
	 obj[0][0]="225";
	 obj[0][1]="1234";
	 obj[1][0]="240";
	 obj[1][1]="1234";
	 
	 return obj;
 }
 */
 @AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		driver=null;
	}
}
