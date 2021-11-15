import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.get("https://www.linkedin.com/");	
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Sreejap.prs@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Sr33j@473");
		driver.findElement(By.xpath("login"));
		//driver.fin;
		//driver.findElement(By.xpat
		
	}

}
