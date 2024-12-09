package TestNG;

import org.testng.annotations.Test;

public class Script 
{
	@Test(priority=0)
	public void signup()
	{
		System.out.println("signup page successfull");
		
	}
	@Test(priority=2)
	public void login()
	{
		System.out.println("login page successfull");
	}
@Test(priority=3)
public void homepage()
{
	System.out.println("homepage successfull");
	
}
@Test(priority=4)
public void logout()
{
	System.out.println("loginpage successfull");
}
	
}
