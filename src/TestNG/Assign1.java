package TestNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Assign1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");

		ChromeOptions addOn = new ChromeOptions();
		addOn.addExtensions(new File("/Users/Ravi/Downloads/ndgimibanhlabgdgjcpbbndiehljcpfh-4.0.6-Crx4Chrome.com.crx"));
		
		
		WebDriver driver=new ChromeDriver(addOn);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		Thread.sleep(4000);
		int Count= driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		Assert.assertEquals(Count, 3);
		
	}

}
