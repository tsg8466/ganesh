package BaseP1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseC1 {

	public static WebDriver driver;
	public static void applicationlaunch()
	{
		WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void closeBrowser()
	{
		driver.close();
	}

}