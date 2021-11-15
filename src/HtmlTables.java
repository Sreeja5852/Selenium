import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://www.w3schools.com/html/html_tables.asp
		

		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//*[@id="customers"]/tbody/tr[2]/td[1]
		System.out.println(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]")));
	}

}
