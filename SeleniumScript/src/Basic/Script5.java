package Basic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script5 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0;i<3;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);	
		}
		for(int j=0;j<3;j++)
		{
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		
	}
	}
}
