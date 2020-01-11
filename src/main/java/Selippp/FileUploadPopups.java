package Selippp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopups {

	public static void main(String[] args) {
				
	System.setProperty("webdriver.chrome.driver", "/Users/arvinderkaur/Downloads/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://html.com/input-type-file/");

    
    driver.findElement(By.name("fileupload")).sendKeys("/Users/arvinderkaur/Desktop/testing.pdf");
    
    
	}

}
