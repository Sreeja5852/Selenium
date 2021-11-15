import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=ca");
		driver.findElement(By.id("username")).sendKeys("sreeja");
		//driver.findElement(By.id("pw")).sendKeys("12345");
		//driver.findElement(By.id("Forgotyourpssword")).click();
		driver.findElement(By.id("password")).sendKeys("Chinnu@43");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.cssSelector("div#error.loginerror"));
		
	}

}
