package Scratch.E2E_project;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
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
	add_req.addMenu();
	add_req.Date();
	add_req.nextBtn();
	
	
	Select drop1=new Select(add_req.Selectanomaly());
	drop1.selectByIndex(2);
	System.out.println("select anomonaly request");
	
	add_req.submitBtn();
	add_req.Cancel1Btn();
	add_req.Cancel2Btn();
	
	driver.close();
	
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
		
	}
}
