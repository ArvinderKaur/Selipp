package Selippp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/arvinderkaur/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
     
   
        // Handle drop down list or box. Create object of select class.
        
        Select select = new Select(driver.findElement(By.name("birthday_month"))); 
        select.selectByVisibleText("Mar");
        
        Select select1 = new Select(driver.findElement(By.name("birthday_day")));
        select1.selectByVisibleText("22");
        
        Select select2 = new Select(driver.findElement(By.name("birthday_year")));
        select2.selectByVisibleText("1988");
	}

}
