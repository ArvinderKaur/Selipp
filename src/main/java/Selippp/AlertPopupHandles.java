package Selippp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandles {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/arvinderkaur/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click(); // with this we will click on go button.
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String alertmessage = alert.getText();
		
		if(alertmessage.equals("Please enter a valid user name"))
		{
			System.out.println("message is correct");
		}
		else
		{
			System.out.println("alert message text does not matchs");
		}
		
		alert.accept(); 	//to press ok button
		driver.quit();
		
		
		
		
	//	alert.dismiss();   // to press cancel button
		
		// This whole program is used to check that message on alert is correct or not.
		// Selenium does not handle windows pop ups.
		
		

	}

}
