package ant.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassOne 
{
	@Test()
	public void oneTest() throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://facebook.com");
			Thread.sleep(2000);
			driver.quit();
		}
	

}
