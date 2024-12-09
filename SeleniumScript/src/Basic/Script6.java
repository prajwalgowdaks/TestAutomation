package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script6 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/prajwal/Desktop/html/disabled.html");
		driver.findElement(By.;
	
	}

}
