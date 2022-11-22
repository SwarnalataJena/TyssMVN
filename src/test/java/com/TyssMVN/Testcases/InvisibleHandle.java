package com.TyssMVN.Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvisibleHandle {
	@Test
	public void handleBymulAttribute()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li"));
		for(WebElement x:ele) {
			String str = x.getText();
			System.out.println(str);
		}

	}

}
