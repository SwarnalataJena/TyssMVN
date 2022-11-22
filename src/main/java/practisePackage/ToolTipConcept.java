package practisePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTipConcept {
	@Test
	public void tConcept()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager");
		WebElement ele = driver.findElement(By.id("keepLoggedInCheckBox"));
		String str = ele.getAttribute("title");
		System.out.println(str);
				
	}

}
