import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	
	public static String name = "Shivin";
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///Users/Ravi/Downloads
		
		System.setProperty ( "webdriver.gecko.driver", "//Users//Ravi//Downloads//geckodriver");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		System.out.println(name);
	}

}
