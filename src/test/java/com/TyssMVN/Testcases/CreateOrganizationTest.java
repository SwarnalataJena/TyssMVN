package com.TyssMVN.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilitypack.JavaUtility;
import utilitypack.PropertyDataUtility;

public class CreateOrganizationTest {
	@Test
	public void createOrganization() throws Throwable
	{
		int jj = JavaUtility.createmulorgname();
		PropertyDataUtility p=new PropertyDataUtility();
		String Url=p.readPropData("url");
		String Un=p.readPropData("un");
		String Pwd=p.readPropData("pwd");
		
		
		String orgname="adddi"+jj;
		WebDriver driver=new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(Un,Keys.TAB,Pwd,Keys.ENTER);
		
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgname);
		
		driver.findElement(By.name("button")).click();
		WebElement e=driver.findElement(By.className("dvHeaderText"));
		String fname=e.getText();
		
		if(fname.contains(orgname))
		{
			System.out.println("test successful :"+orgname);
		}
		
		WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();
	}

}
