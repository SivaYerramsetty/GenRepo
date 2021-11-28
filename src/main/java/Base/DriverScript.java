package Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public DriverScript() 
	
	{
		try
		{
			 File src = new File("./Configuration/Config.properties");
			 FileInputStream stream = new FileInputStream(src);
			  prop = new Properties();
			  prop.load(stream);
		}
		catch(Exception e)
		{
			System.out.println("Unable to load the properties file " + e.getMessage());
		}
		
	}	
	
	public static void initapp()
	{
		String Browser = prop.getProperty("browser");
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Browsers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String url = prop.getProperty("qaurl");
		driver.get(url);
	}
			

}
