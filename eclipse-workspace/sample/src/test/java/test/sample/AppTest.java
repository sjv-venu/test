package test.sample;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://automationpractice.com/index.php");
    	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
    	Thread.sleep(5000);
    	
    	Thread.sleep(5000);
    	driver.quit();
    	
    }
}

