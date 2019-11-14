package rWait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Sanjay\\Selenium_Training\\RevisionWait\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.softwaretestingmaterial.com/");
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs("Software Testing Material"));
		driver.close();
	}

}
