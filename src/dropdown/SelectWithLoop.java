package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flighthub.com/cheap-flights-12");
		driver.findElement(By.className("passengers")).click();

		driver.findElement(By.xpath("//*[@id=\'popover550162\']/div[2]/div[1]/div[2]/div[3]/i")).click();
		
	}

}
