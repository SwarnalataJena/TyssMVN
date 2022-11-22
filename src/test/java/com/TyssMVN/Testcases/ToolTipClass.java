package com.TyssMVN.Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipClass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.lenskart.com/our-purpose");
		List<WebElement> ele = driver.findElements(By.xpath("//nav[@class='topNav_bar is-no-scroll']/ul[@class='display-flex']/li/a"));
		for(int i=0;i<ele.size();i++)
		{
			String str=ele.get(i).getAttribute("title");
			System.out.println(str);
		}
		
	}

}
