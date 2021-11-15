package dropdown;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty ( "webdriver.chrome.driver", "//Users//Ravi//Downloads//chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("/Users/Ravi/Downloads/ndgimibanhlabgdgjcpbbndiehljcpfh-4.0.6-Crx4Chrome.com.crx"));
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://beta.spicejet.com/");
		//driver.findElement(By.className("class=\"css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu\"")).click();
		//driver.findElement(By.id("")).click();
		//div[16]  --- chennai Xpath
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();
		
		driver.findElement(By.xpath("//div[20]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();
		driver.findElement(By.xpath("//div[16]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Departure Date']")).click();
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[@class='css-1dbjc4n r-1niwhzg r-13awgt0 r-1jgb5lz r-r0h9e2 r-13qz1uu']/div[@class='css-1dbjc4n r-14lw9ot']/div[@class='css-1dbjc4n r-14lw9ot r-z2wwpe r-vgw6uq r-156q2ks r-urutk0 r-8uuktl r-136ojw6']/div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[@class='css-1dbjc4n r-19h5ruw r-136ojw6']/div/div[@class='css-1dbjc4n r-1niwhzg r-z2wwpe r-17b9qp5 r-1g94qm0 r-h3f8nf r-u8s1d r-u3yave r-8fdsdq']/div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-rs99b7 r-6koalj r-eqz5dr r-1pi2tsx r-pm9dpa r-1knelpx r-13qz1uu']/div[@class='css-1dbjc4n r-1euycsn']/div[@class='css-1dbjc4n r-150rngu r-18u37iz r-16y2uox r-1wbh5a2 r-lltvgl r-buy8e9 r-1sncvnh']/div[@class='css-1dbjc4n r-18u37iz']/div[1]/div[1]/div[3]/div[5]/div[7]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[normalize-space()='Return Date']")).click();
		driver.findElement(By.xpath("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1)")).click();
				
	}
		
}
