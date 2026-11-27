package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void testautoaction() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Actions action = new Actions(driver);
		
		WebElement mouse = driver.findElement(By.xpath("//button[text()='Point Me']"));
		
		js.executeScript("arguments[0].scrollIntoView();", mouse);
		
		action.moveToElement(mouse).perform();		
		
		Thread.sleep(2000);
		
		WebElement dbclick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
	
		action.doubleClick(dbclick).perform();
		
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
		
	}
	
	public static void vinothaction() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Actions action = new Actions(driver);
		
		WebElement dbclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		
		js.executeScript("arguments[0].scrollIntoView(false);", dbclick);
		
		action.doubleClick(dbclick).perform();
		Thread.sleep(2000);
		
		WebElement rtclick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		js.executeScript("arguments[0].scrollIntoView(false);", rtclick);
		
		action.contextClick(rtclick).perform();
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='dragItem']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='dropZone']"));
		js.executeScript("arguments[0].scrollIntoView(false);", drop);
		
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		
		WebElement hover = driver.findElement(By.xpath("//div[@id='tooltipTarget']"));
		js.executeScript("arguments[0].scrollIntoView(false);", hover);
		action.moveToElement(hover).perform();
		Thread.sleep(2000);
		
		WebElement slide = driver.findElement(By.xpath("//div[@id='handle_max']"));
		js.executeScript("arguments[0].scrollIntoView(false);", slide);
		
		action.clickAndHold(slide).moveByOffset(2, 0).release().perform();
		Thread.sleep(2000);
		
	}
	
	public static void slidevalue() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
//		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		Actions action = new Actions(driver);
		
		WebElement slide = driver.findElement(By.xpath("//div[@id='handle_max']"));
		js.executeScript("arguments[0].scrollIntoView(false);", slide);
		
		Dimension size = slide.getSize();
		int icon = size.getWidth();
		System.out.println(icon);
		
		WebElement slidefill = driver.findElement(By.xpath("//div[@class='slider-track']"));
		Dimension size1 = slidefill.getSize();
		int fill = size1.getWidth();
		System.out.println(fill);
		
		int max = 3000;
		int min = 250;
		int balvalue = max-min;
		System.out.println("total euros: "+balvalue);
		

		int totalvalue = fill-icon;
		System.out.println("total value: "+ totalvalue);
		
		int ratio = balvalue/totalvalue;
		
		System.out.println("The ratio is: " + ratio);
		driver.close();

		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
//		testautoaction();
//		vinothaction();
		slidevalue();
	}
}
