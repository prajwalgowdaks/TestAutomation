package Basic;

import java.util.ArrayList;

import org.apache.batik.apps.rasterizer.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Seleniumdev {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Actions act = new Actions(driver);
		ArrayList<String> link1 = new ArrayList<String>();
		WebDriver path = driver.findE("By.xpath("(//a[@class='card-link'])[1]"));
	}
}
