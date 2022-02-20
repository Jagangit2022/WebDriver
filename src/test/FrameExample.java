package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		//System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		driver.switchTo().frame("frame1");
		
		//WebElement element = driver.findElement(By.xpath("//button[@id='windowButton']"));
		WebElement element = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(element.getText());
		//element.click();
		
		driver.switchTo().defaultContent(); // to go back to main frame or parent window

	}

}
