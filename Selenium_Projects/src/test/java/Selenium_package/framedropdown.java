package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class framedropdown {

		
	public static void task1() throws InterruptedException {
			
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.switchTo().frame("frm2");
		Thread.sleep(2000);
		
		WebElement options = driver.findElement(By.xpath("//select[@id='selectnav1']"));
		js.executeScript("arguments[0].scrollIntoView();", options);
		
		Thread.sleep(3000);
		
		Select select = new Select(options);
		
		select.selectByVisibleText("- XPath Practice");
		
		Thread.sleep(5000);
		
		WebElement option1 = driver.findElement(By.xpath("//select[@id='selectnav1']"));
		js.executeScript("arguments[0].scrollIntoView();", option1);
		
		Select select1 = new Select(option1);
		
		select1.selectByValue("https://www.hyrtutorials.com/p/basic-controls.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Abrar");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Ahmed");
		
		driver.findElement(By.xpath("//input[@id='malerb']")).click();
		
		driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abrar@email.com");
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	public static void task2() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.switchTo().frame("frm3");
		Thread.sleep(2000);
		
//		WebElement scroll = driver.findElement(By.xpath("//select[@id='selectnav1']"));
//		js.executeScript("arguments[0].scrollIntoView();", scroll);
//		
//		Thread.sleep(3000);
//		
//		Select select = new Select(scroll);
//		
//		select.selectByIndex(2);
//		Thread.sleep(3000);
		
		driver.switchTo().frame("frm1");
		Thread.sleep(2000);
		
		WebElement scroll1 = driver.findElement(By.xpath("//select[@id='selectnav1']"));
		js.executeScript("arguments[0].scrollIntoView();", scroll1);
		
		Thread.sleep(3000);
		
		Select select1 = new Select(scroll1);
		
		select1.selectByIndex(2);
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		
		driver.switchTo().frame("frm2");
		Thread.sleep(3000);
		
		WebElement inputs = driver.findElement(By.xpath("//input[@id='firstName']"));
		js.executeScript("arguments[0].scrollIntoView();",inputs);
		
		inputs.sendKeys("Abrar");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Ahmed");
		
		driver.findElement(By.xpath("//input[@id='malerb']")).click();
		
		driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abrar@email.com");
		
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		driver.switchTo().frame("frm3");
		Thread.sleep(2000);
		
//		WebElement scroll2 = driver.findElement(By.xpath("//h3[text()='Frame3:']"));
//		js.executeScript("arguments[0].scrollIntoView();",scroll2);
		
		System.out.println("Now its in Frame3 inside a Parent frame3");
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
//		task1();
		task2();
		
	}
}
