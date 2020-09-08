package Scratch.E2E_project;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resource.AdditionalPom;

public class AdditionalRequ extends Base_class {

	@BeforeTest
	public void Badd_req() throws IOException
	{
		driver=Intilizer();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void add_req()
	{
		AdditionalPom add_req=new AdditionalPom(driver);

	add_req.Action_button();
	
	driver.findElement(By.xpath("")).click();
	System.out.println("Click on Additional request button");
	
	driver.findElement(By.xpath("//*[@id='mainContainerDiv']/ng-view/sc-additional-requests/div/div[3]/div/div[2]/div[1]/fieldset/label/span")).click();
	System.out.println("Select date from list");
	
	//Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id='mainContainerDiv']/ng-view/sc-additional-requests/div/div[4]/button[1]")).click();
	System.out.println("Click on next button");
	
	Select drop1=new Select(driver.findElement(By.xpath("//*[@id='additional-request-summary']/div[4]/div[1]/div[2]/select")));
	drop1.selectByIndex(2);
	System.out.println("select anomonaly request");
	
	
	/*driver.findElement(By.xpath("//*[@id='additional-request-summary']/div[5]/button[1]")).click();
	System.out.println("Click on Submit button button");*/
	
	
/*	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id='additional-request-summary']/div[5]/button[2]")).click();
	System.out.println("Click on Cancel button button");
	
	driver.findElement(By.xpath("//*[@id='mainContainerDiv']/ng-view/sc-additional-requests/div/div[4]/button[2]")).click();
	System.out.println("Click on Cancel button button on Additional Requests screen");
	
	System.out.println(driver.getCurrentUrl());
	
	System.out.println("all operations prrform in staffConnect");*/
	
	
	
	
	
	
	
	
	
	Thread.sleep(5000);
	driver.close();
	
	}
}
