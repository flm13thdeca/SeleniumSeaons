package mar2nd;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class AdactinLogin2 {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Browser Started ..");
		System.out.println("App launched..");
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Browser Closed ...");
	}
	
	@Test
	public void loginUsingValidUsernameAndValidPassword()
	{
		
		System.out.println("Valid Username Entered ...");
		System.out.println("Valid Password Entered ...");
		System.out.println("Login Button Clicked..");
		System.out.println("loginUsingValidUsernameAndValidPassword is passed ..");
		
	}
	
	@Test
	public void loginUsingInValidUsernameAndValidPassword()
	{
		
		System.out.println("InValid Username Entered ...");
		System.out.println("Valid Password Entered ...");
		System.out.println("Login Button Clicked..");
		System.out.println("loginUsingnInValidUsernameAndValidPassword is passed ..");
		
	}
	
	@Test
	public void loginUsingValidUsernameAndInValidPassword()
	{
		
		System.out.println("Valid Username Entered ...");
		System.out.println("InValid Password Entered ...");
		System.out.println("Login Button Clicked..");
		System.out.println("loginUsingnValidUsernameAndInValidPassword is passed ..");
		
	}

}
