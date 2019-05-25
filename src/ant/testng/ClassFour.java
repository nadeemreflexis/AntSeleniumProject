package ant.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ClassFour 
{
	@Test
	public void fourTest() throws InterruptedException
		{
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://tumblr.com");
		Thread.sleep(2000);
		driver.quit();
		}

}
