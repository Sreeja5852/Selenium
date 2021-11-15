package TestNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class TestNG1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");

		ChromeOptions addOn = new ChromeOptions();
		addOn.addExtensions(new File("/Users/Ravi/Downloads/ndgimibanhlabgdgjcpbbndiehljcpfh-4.0.6-Crx4Chrome.com.crx"));
		
		
		WebDriver driver=new ChromeDriver(addOn);
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/#");
		
		int count = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		
		Assert.assertEquals(count, 6);
		//driver.findElements(By.cssSelector("input[type='checkbox']")).click();
		
	}

}
