package TestNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");

		ChromeOptions addOn = new ChromeOptions();
		addOn.addExtensions(new File("/Users/Ravi/Downloads/ndgimibanhlabgdgjcpbbndiehljcpfh-4.0.6-Crx4Chrome.com.crx"));
		
		WebDriver driver = new ChromeDriver();	
	
		driver.get("https://www.amazon.ca/");
		
		Actions a = new Actions(driver);
		
		 WebElement move=driver.findElement(By.cssSelector("a [id='nav-link-accountList']"));
		 
		 a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Airfryer").build().perform();
		 
		// a.moveToElement(move).contextClick().build().perform();
		 
		 


		
	}

}

