package rWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitExtended {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Sanjay\\Selenium_Training\\RevisionWait\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("ramesh.sanjay@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement pw= driver.findElement(By.name("password"));
		pw.clear();
		pw.sendKeys("Gmail@2009");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":k8\"]/div/div"))).click();

	}

}
