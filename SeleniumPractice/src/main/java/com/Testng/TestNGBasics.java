package com.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	//pre-requisites - Starting with @Before
	@BeforeSuite   //1
	public void setup()
	{
		System.out.println("Setup system property for chrome");
	}
	
	
	@BeforeTest   //2
	public void launchBrowser()
	{
		System.out.println("Launch chrome browser");

	}
	
	@BeforeClass  //3
	public void login()
	{
		System.out.println("Login method");
	}
	
	@BeforeMethod  //4
	public void enterURL()
	{
		System.out.println("enter URL");
	}
	
	
	//test cases - Starting with @Test
	@Test  //5
	public void googleTitleTest()
	{
		System.out.println("google test");
	}
	
	
	//post-requisites - starting with @After
	@AfterMethod  //6
	public void logout()
	{
		System.out.println("logout of the app");
	}
	
	@AfterClass   //7
	public void closeBrowser()
	{
		System.out.println("closeBrowser");

	}
	
	@AfterTest   //8
	public void deleteAllCookies()
	{
		System.out.println("deleteAllCookies");
	}
	
	
	@AfterSuite   //9
	public void generateTestReport()
	{
		System.out.println("generateTestReport");
	}
	

}
