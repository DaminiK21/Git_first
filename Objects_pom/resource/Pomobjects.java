package resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomobjects {
	WebDriver driver;
	public Pomobjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	
	@FindBy(xpath="//*[@id='name']/input")
	WebElement user;
	
	@FindBy(xpath="//*[@id='password']/input")
	WebElement password;
	@FindBy(xpath="//div[@class='col-xs-12']//button[contains(text(),'SIGN IN')]")
	WebElement submit;
		
	public WebElement username()
	{
		return user;
	}
	public WebElement pass()
	{
		return password;
	}
	public WebElement button()
	{
		return submit;
	}
	
	
	//Thread.sleep(5000);
	/*driver.findElement(By.xpath("//*[@ng-model='vm.employeeID']")).sendKeys("211");
	driver.findElement(By.xpath("//*[@id='mainContainerDiv']/ng-view/sc-proxy-login/div/form/div[5]/button[1]")).click();*/
	}
	
	



