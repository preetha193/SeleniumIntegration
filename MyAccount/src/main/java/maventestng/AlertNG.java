package maventestng;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class AlertNG {

	WebDriver driver;

	@BeforeSuite
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\joyka\\Documents\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		//launch the web browser
		driver=new ChromeDriver();

	}

	@AfterSuite
	public void closebrowser()
	{
		driver.quit();

	}
	@Test(priority=1)
	public void alertexample()
	{
		try
		{
			driver.manage().window().maximize();
			driver.get("http://www.leafground.com/pages/Alert.html");
			driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button")).click();
			Alert alert= driver.switchTo().alert();
			Thread.sleep(5000);
			alert.accept(); // to click on ok since we have only one option
			// second task to click on confirm box button
			driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button")).click();
			Alert alert2=driver.switchTo().alert();
			alert2.accept();
			Thread.sleep(5000);
			//third task: by prompt box
			driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button")).click();
			Alert promptBox=driver.switchTo().alert();
			promptBox.sendKeys("Hi");
			Thread.sleep(5000);
			promptBox.accept();
			//task 4 line breaks in alert box
			driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/button")).click();
			Alert lineBreak=driver.switchTo().alert();
			Thread.sleep(5000);
			lineBreak.accept();
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}


	}


}


