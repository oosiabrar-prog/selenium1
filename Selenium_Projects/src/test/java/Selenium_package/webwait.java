package Selenium_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webwait {
	
	public static void implicit() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		Thread.sleep(30000);
		
		driver.findElement(By.xpath("//input[@id='txt1']")).sendKeys("Abrar");
		
	}
	
	public static void explicit() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btn1']")));
		
		until.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='txt1']")));
		
		until.sendKeys("Abrar");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		explicit();
	}
}
