package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertion {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();gi
		driver.get("https://www.facebook.com/");
		String expextedTitle="log in or sign up";
		String expectedTitle="log in or sign up";
		String actualTitle=driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		System.out.print(actualTitle);
		driver.quit();
		s.assertAll();
		


	}

}
