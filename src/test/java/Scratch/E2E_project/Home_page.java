package Scratch.E2E_project;

import java.io.IOException;
import java.util.Base64;
import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resource.Pomobjects;


public class Home_page extends Base_class {
	public static Logger log =LogManager.getLogger(Base_class.class.getName());
	@BeforeTest
	public void initilize() throws IOException
	{
		driver=Intilizer();
		driver.get(prop.getProperty("url"));
		log.info("navigate to login");
	}
	@Test
	public void Login() throws IOException
	{
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Pomobjects obj= new Pomobjects(driver);
		obj.username().sendKeys("225");
		obj.pass().sendKeys("1234");
		obj.button().click();
		
		System.out.println("Login Successfully");
		
		
	}
	
	@AfterTest
		public void closeBrowser() throws InterruptedException
		{
			//Thread.sleep(5000);
			driver.close();
			driver=null;
			
		}

	}


