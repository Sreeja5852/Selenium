import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				///Users/Ravi/Downloads
		
		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://facebook.com");
		
		//xpath syntax=//tagname[@attribute='value']
		
//		driver.findElement(By.id("email")).sendKeys("sreejap.prs@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Sr33j@473");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.linkText("Forgot Password?")).click();
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("sreejap.prs@gmail.com");
		
		
		//CSS first syntax=tagname[attribute='value']
//		driver.findElement(By.cssSelector("*[id=\"pass\"]")).sendKeys("Sr33j@473");
		//Css second syntax=tagname#id
		//driver.findElement(By.cssSelector("input#pass")).sendKeys("Sr33j@473");
		driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).sendKeys("Sr33j@473");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	}

