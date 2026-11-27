package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	
	public static void singleframe() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.switchTo().frame("singleframe");
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].scrollIntoView();", text);
		Thread.sleep(3000);
		text.sendKeys("Abrar");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		Thread.sleep(2000);
		WebElement frm1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frm1);
		
		WebElement frm2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(frm2);
		System.out.println("Now switched to frame inside frame");
		Thread.sleep(3000);
		WebElement text2 = driver.findElement(By.xpath("//input[@type='text']"));
		text2.sendKeys("Ahmed");
	
	}
	public static void main(String[] args) throws InterruptedException {
		
		singleframe();
		
	}

}
