package Selenium_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class validatemethod {
	
	public static void main(String[] args) throws AWTException {
		
	
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
		
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
				
		driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']"));
		
		
		
		
			
	}

}
