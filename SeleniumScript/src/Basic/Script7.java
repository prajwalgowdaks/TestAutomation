package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script7 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/SignUpPage");
		Thread.sleep(3000);
		driver.findElement(By.id("browserButton2")).click();
		Set<String> wins = driver.getWindowHandles();
		int count=wins.size();
		System.out.println(count);
		
		
		
	}

}
