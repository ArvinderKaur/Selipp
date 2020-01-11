package Selippp;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Selipppc {

	public static void main(String[] args) 
	{
		
	/*  This how to launch Firefox.
		
		System.setProperty("webdriver.gecko.driver", "/Users/arvinderkaur/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");  */
		
		
	// This how to launch Google Chrome.
		
		System.setProperty("webdriver.chrome.driver", "/Users/arvinderkaur/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    if(title.equals("Google"))
	    	{
	    	 System.out.println("hiii");
	    	}
	    else
	    {
	    	System.out.println("ohni");
	    }
	    
	    System.out.println(driver.getCurrentUrl());

	    //System.out.println(driver.getPageSource());
	    
		/*These are optional properties.
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
	    driver.quit();
		
	}

}
