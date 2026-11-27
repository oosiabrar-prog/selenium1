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

public class fileuploadtask {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click();
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
//		Thread.sleep(3000);
		
		
		WebElement ele = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		ele.clear();
		ele.sendKeys("Software");
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Browse']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
//		Thread.sleep(2000);
			
		Actions action = new Actions(driver);
		action.click(element).perform();
		
//		Thread.sleep(2000);
		
		String filepath = "C:\\Users\\HP\\Downloads\\Stockdetails.pdf";
		
		Robot rb = new Robot();
		
		StringSelection selection = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		rb.delay(2000);
		
		driver.close();
	}
}
