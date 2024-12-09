package Basic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;

public class Script4 {

	public static <TakeScreenShot> void main(String[] args) throws IOException, InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipakart.com");
		driver.manage().window().maximize();
		Date d=new Date();
	String	 d1 = d.toString().replace(":","-");
	WebElement usn=driver.findElement(By.xpath("//a"));
	 TakesScreenshot ts = (TakesScreenshot)driver;
	  File temp = ts.getScreenshotAs(OutputType.FILE);
	 File perm = new File("./Screenshot/flip/"+i+"Defect.png");
	 FileHandler.copy(temp, perm);
	 Thread.sleep(2000);
	 driver.quit();
	 
	
	}

}
