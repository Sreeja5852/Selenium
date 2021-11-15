package dropdown;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		String name = "Sreeja";
		// TODO Auto-generated method stub

		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");

		ChromeOptions addOn = new ChromeOptions();
		addOn.addExtensions(new File("/Users/Ravi/Downloads/ndgimibanhlabgdgjcpbbndiehljcpfh-4.0.6-Crx4Chrome.com.crx"));
		
		
		WebDriver driver=new ChromeDriver(addOn);
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/#");
		//driver.findElement(By.id("autosuggest")).click();
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> li = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		
		System.out.println(li.size());
		System.out.println(name);
		
		for(WebElement we :li) {
			System.out.println(we.getText());

			if(we.getText().equalsIgnoreCase("India")) {
				we.click();
				break;
			}
		}
		
		
	}

}
