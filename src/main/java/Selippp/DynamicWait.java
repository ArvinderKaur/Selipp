package Selippp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DynamicWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/arvinderkaur/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ca.cogmento.com/");
		
		driver.findElement(By.linkText("LOG IN")).click();
		driver.findElement(By.name("email")).sendKeys("arvinderkaurriar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("28882888");
        driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button') and text()='Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Contacts")).click();
        driver.quit();
        
        // in case of frame
        
       //driver.switchTo().frame(nameOrId);
       // driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
        
        

	}

}
