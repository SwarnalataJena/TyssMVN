package com.TyssMVN.Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InviHandle {
	@Test
		public void test2() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lenskart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).click();
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='trending_list menu-link']/li"));
		
		for(WebElement x:ele) {
			String str = x.getText();
			System.out.println(str);
		}
		
			
		}
	

}
