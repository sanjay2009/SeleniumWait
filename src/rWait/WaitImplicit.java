package rWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitImplicit {
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Sanjay\\Selenium_Training\\RevisionWait\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		String etitle= "Demo Guru99 Page";
		String atitle= "";
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		atitle= driver.getTitle();
		if(atitle.equalsIgnoreCase(etitle)) {
			System.out.println("Test Passed");
		}
		
		else {
			System.out.println("Test Failed");
		}
		
		driver.close();
	}

}
