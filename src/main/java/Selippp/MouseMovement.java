package Selippp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/arvinderkaur/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		
		Thread.sleep(300);
		
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		
		Thread.sleep(300);
		
		driver.findElement(By.linkText("SpiceBiz")).click();
		

	}

}
