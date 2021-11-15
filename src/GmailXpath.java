import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Sreeja");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("1234");

		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"error\"]")).toString();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"error\"]")).getText());


		//driver.findElement(null)

		
		
	}

}
