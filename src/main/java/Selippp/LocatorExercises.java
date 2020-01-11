package Selippp;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExercises {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/arvinderkaur/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// We have 8 locators
		
		//Priority:2	// 1. Xpath: note: dont use hiraicy based xpaths like html/body/div etc they can occationaly. elements can change.
		//relative xpath should be used not absolute one.
		//driver.findElement(By.xpath("//*[@id=\"u_0_f\"]")).sendKeys("arvinder");
		//driver.findElement(By.xpath("//*[@id=\"u_0_h\"]")).sendKeys("Kaur");
		//driver.findElement(By.xpath("//*[@id=\"u_0_k\"]")).sendKeys("arvinderkaurriar@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("arvinderkaurriar@gmail.com");

	//Priority:1     //2. id:
		
		//driver.findElement(By.id("u_0_f")).sendKeys("Arvinder");
		//driver.findElement(By.id("u_0_h")).sendKeys("kaur");
		//driver.quit();
		
		//Priority:3	//3. Name:
		
		//driver.findElement(By.name("firstname")).sendKeys("arvinder");
		//driver.findElement(By.name("lastname")).sendKeys("kaur");
		//driver.findElement(By.name("reg_email__")).sendKeys("arvinderkaurriar@gmail.com");
		//driver.findElement(By.name("reg_email_confirmation__")).sendKeys("arvinderkaurriar@gmail.com");
		
		//Priority:1 for links		//4. LinkText: It is specialy being used as link text locator 
		
		// driver.findElement(By.linkText("Create a Page")).click();
		
		//5. partialLinkText: not recommended to use. when link text is long then can be use. provide partial part of link text.
		
		//driver.findElement(By.partialLinkText("Create")).click();
		
		//6. CSSSelector: very usefull.right click on blue line. it is #nameofid of any element.if no id, class is there then .nameofclass
		
		//driver.findElement(By.cssSelector("#u_0_f")).sendKeys("hiiii");
		
		//7. className: not recommended. classname can be same for different elements.
		
		//driver.findElement(By.className("nameofclass")).sendKeys(keysToSend);
		
		
	}

}
