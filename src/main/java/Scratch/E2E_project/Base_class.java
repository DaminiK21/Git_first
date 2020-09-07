package Scratch.E2E_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base_class {
	
	public static WebDriver driver;
	public Properties prop;
	private Object TakesScreenshot;
	public WebDriver Intilizer() throws IOException
	{
		 prop=new Properties();
		FileInputStream fis= new FileInputStream("G:\\eclipse-java-2019-09-R-win32-x86_64\\E2E_project\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","G:\\eclipse-java-2019-09-R-win32-x86_64\\eclipse\\Chrome 85\\chromedriver.exe");
			 driver= new ChromeDriver();
		}
		
		else if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","G:\\geckodriver.exe");
			 driver= new FirefoxDriver();
		}
		
		else {
			System.setProperty("webdriver.ie.driver","G:\\IE_driver\\IEDriverServer_x64_2.39.0\\IEDriverServer.exe");
			
			
			 driver= new InternetExplorerDriver();

		}
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	
	}
	public void getScreenshot(String result) throws IOException
	{
		
		File  src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("G:\\eclipse-java-2019-09-R-win32-x86_64\\eclipse\\Screnshots\\"+result+"Screensho2.jpg"));		
	}
	
	public void getScreenshotsucess(String result1) throws IOException
	{
		
		File  src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("G:\\eclipse-java-2019-09-R-win32-x86_64\\eclipse\\Screnshots\\"+result1+"Screensho2.jpg"));		
	}

}
