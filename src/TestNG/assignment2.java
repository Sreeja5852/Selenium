package TestNG;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");

		ChromeOptions addOn = new ChromeOptions();
		addOn.addExtensions(new File("/Users/Ravi/Downloads/ndgimibanhlabgdgjcpbbndiehljcpfh-4.0.6-Crx4Chrome.com.crx"));
		
		//System.out.println(li.size());
		//System.out.println(name);
		
		WebDriver driver=new ChromeDriver(addOn);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//button[@class='flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@aria-label='Wed Nov 03 2021']//div[@class='p-1 day-gridContent flex flex-middle flex-column flex-center flex-top'][normalize-space()='3']")).click();
		WebElement drop1 = driver.findElement(By.cssSelector("div[class='mb-4'] select[class='bc-neutral-100 bg-transparent']"));
		Select drop1Select = new Select(drop1);
		drop1Select.selectByVisibleText("3");
		WebElement drop2 = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(3) > select:nth-child(2)"));
		Select drop2Select = new Select(drop2);
		drop2Select.selectByValue("3");
		Thread.sleep(2000);
		WebElement drop3 = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(5) > select:nth-child(2)"));
		Select drop3Select = new Select(drop3);
		drop3Select.selectByIndex(2);
		
		driver.findElement(By.linkText("More options: Class of travel, Airline preference")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("British Airways");
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//button[normalize-space()='Search flights']")).isEnabled());
	}
}
