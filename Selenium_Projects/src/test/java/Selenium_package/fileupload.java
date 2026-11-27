package Selenium_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileupload {
	
	public static void upload1() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.xpath("//input[@id='fileInput']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(2000);
		
//		element.click();
		
		String filepath = "C:\\Users\\HP\\Downloads\\Stockdetails.pdf";
		
		driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys(filepath);
		Thread.sleep(3000);
//		StringSelection selection = new StringSelection(filepath);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		driver.findElement(By.xpath("//button[@id='fileSubmit']")).click();
	}
	
	public static void upload2() throws InterruptedException, AWTException {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement element = driver.findElement(By.xpath("//input[@id='fileInput']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.click(element).perform();
		
		Thread.sleep(2000);
		
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
		
		driver.findElement(By.xpath("//button[@id='fileSubmit']")).click();
		
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
//		upload1();
		upload2();
		
	}

}
