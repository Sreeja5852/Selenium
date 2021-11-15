package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jquery.com/");
		//driver.findElement(By.id(""))
	}

}
