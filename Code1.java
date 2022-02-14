package org.automation.code;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Code1 
{
	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.youtube.com/");
			String title=driver.getTitle();
			System.out.println("Title is:- "+title); //to get title of the webpage 
		/*	String sourcecode=driver.getPageSource();
			System.out.println("Source code is:- "+sourcecode);*/ //to get source code of webpage in string form
		/*  driver.close();
			Thread.sleep(5000);
			driver.manage().window().setSize(new Dimension(300,700));*/ //to set the new dimension of webpage
			driver.findElement(By.name("search_query")).sendKeys("michael jackson");
			driver.findElement(By.id("search-icon-legacy")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("endpoint")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@title='Subscriptions']")).click();
	}
}


