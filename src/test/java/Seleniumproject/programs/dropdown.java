package Seleniumproject.programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("@3233");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		if(driver.switchTo().alert().getText().equals("Do you really want to delete this Customer?"))
				{
			Thread.sleep(4000);
			  driver.switchTo().alert().accept();
			  
			   if(driver.switchTo().alert().getText().equals("Customer Successfully Delete!"))
					   {
				   driver.switchTo().alert().accept();
					   }
			  
				}
		else
		{
			 driver.switchTo().alert().dismiss();
		}
		
		
		
		
		
  
	}

}
