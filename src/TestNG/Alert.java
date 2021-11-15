package TestNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	private static final CharSequence Text = null;
	private static final CharSequence Sreeja = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");

		ChromeOptions addOn = new ChromeOptions();
		addOn.addExtensions(new File("/Users/Ravi/Downloads/ndgimibanhlabgdgjcpbbndiehljcpfh-4.0.6-Crx4Chrome.com.crx"));
		
		
		WebDriver driver=new ChromeDriver(addOn);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String text="Sreeja";
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("id=\"alertbtn\"")).click();
		//driver.switchTo().alert().getText();
		//driver.switchTo().alert().accept();
		//driver.findElement(By.id("confirmbtn")).click();
		
	}

}
