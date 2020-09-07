package Scratch.E2E_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resource.Message_board;
import resource.Pomobjects;

public class Message_on_employee_screen extends Base_class {
	
	
	@BeforeTest
	public void initilize() throws IOException
	{
		driver=Intilizer();
		driver.get(prop.getProperty("url"));
		
	}
	@Test
	public void Message() throws IOException, InterruptedException
	{
	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Pomobjects obj= new Pomobjects(driver);
		obj.username().sendKeys("240");
		obj.pass().sendKeys("1234");
		obj.button().click();
		obj.pass().sendKeys(Keys.ENTER);
		System.out.println("Login Successfully");
		
		Message_board msg= new Message_board(driver);
		//msg.Emp_id().sendKeys("211");
		//msg.LoginAsEmp().click();
		//System.out.println("login as employee sucess");
		Thread.sleep(10000);
		System.out.println(msg.Exit().isEnabled());
		//System.out.println(msg.message_popup().isEnabled());
		if (msg.Exit().isEnabled() && msg.message_popup().isDisplayed()) {

			System.out.println("message is display");

			//msg.Exit().click();
			
			System.out.println("close message window");
		}

		else {

			System.out.println("no message");

		}
	
		
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		driver=null;
	}
	

}
