package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		//System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		WebElement FileUpload = driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		
		FileUpload.sendKeys("/home/jaganathagdgmai/eclipse-workspace/CoreJava/results.txt");
		
		WebElement TnC = driver.findElement(By.id("terms"));
		TnC.click();
		
		WebElement Submit = driver.findElement(By.id("submitbutton"));
		Submit.click();


	}

}
