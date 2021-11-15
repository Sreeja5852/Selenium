import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//get dropdown webelement;
		
		WebElement adultdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//Create a Select Object to work with static dropdowns
		Select dropdown = new Select(adultdropdown);
		dropdown.selectByIndex(1);
		dropdown.selectByValue("USD");
		dropdown.selectByVisibleText("AED");
	
	}

}
