package ant.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ClassThree 
{
	@Test
	public void threeTest() throws InterruptedException
		{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		Thread.sleep(2000);
		driver.quit();
		//throw new SkipException("third test case is skipped");
		
		}

}
