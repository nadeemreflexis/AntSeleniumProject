package ant.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassTwo 
{
	@Test
	public void twoTest() throws InterruptedException
		{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		Thread.sleep(2000);
		driver.quit();
		}

}
