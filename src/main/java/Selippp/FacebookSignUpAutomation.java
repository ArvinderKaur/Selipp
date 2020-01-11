package Selippp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpAutomation {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/arvinderkaur/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id=\"u_0_f\"]")).sendKeys("arvinder");
		driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).sendKeys("Kaur");
		driver.findElement(By.name("reg_email__")).sendKeys("arvinderkaurriar@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("arvinderkaurriar@gmail.com");
		driver.findElement(By.id("u_0_p")).sendKeys("Demodemo@123");
		
		Select select = new Select(driver.findElement(By.name("birthday_month"))); 
        select.selectByVisibleText("Mar");
        
        Select select1 = new Select(driver.findElement(By.name("birthday_day")));
        select1.selectByVisibleText("22");
        
        Select select2 = new Select(driver.findElement(By.name("birthday_year")));
        select2.selectByVisibleText("1988");
        
        driver.findElement(By.id("u_0_9")).click();
		
        driver.findElement(By.name("websubmit")).click();
        

	}

}
