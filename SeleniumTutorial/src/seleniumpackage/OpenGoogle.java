package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Preetha\\Documents\\Selenium\\chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.united.com/en/us");
		driver.manage().window().maximize();
		driver.findElement(By.id("bookFlightOriginInput")).clear();
		driver.findElement(By.id("bookFlightOriginInput")).sendKeys("IAH");
		driver.findElement(By.id("bookFlightDestinationInput")).clear();
		driver.findElement(By.id("bookFlightDestinationInput")).sendKeys("ORD");
		//List<WebElement> startDate=driver.findElements(By.xpath("//*[@id='DepartDate']"));
		
		
		
		
		}
		
		}
	


