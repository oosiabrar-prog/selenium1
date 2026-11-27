package Selenium_package;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowshandling {
	
	
	public static void windowshandtype1() throws InterruptedException {

	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://vinothqaacademy.com/multiple-windows/");
	
		Thread.sleep(5000);
	
		//first button
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		
		Thread.sleep(5000);
		
		Set<String> win1 = driver.getWindowHandles();
		List<String> win2 = new ArrayList<>(win1);
		
		String tab1 = win2.get(0);
		String tab2 = win2.get(1);
		
		System.out.println("Main page tab Unique code is: "+tab1);
		System.out.println("Tab2 Unique Code is: "+tab2);
		
		driver.switchTo().window(tab2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='nameInput']")).sendKeys("Abrar");
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(tab1);
		
		//second button
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		Thread.sleep(5000);
		
		Set<String> wind1 = driver.getWindowHandles();
		List<String> wind2 = new ArrayList<>(wind1);
		
		String tabb2 = wind2.get(1);
		
		System.out.println("Tab 2 Unique Code is: "+tabb2);
		
		driver.switchTo().window(tabb2);
		driver.findElement(By.xpath("//input[@id='nameInput']")).sendKeys("Abrar");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Tab 2 title is: "+title);
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(tab1);
		
		//third button
		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
		Thread.sleep(5000);
		
		Set<String> windo1 = driver.getWindowHandles();
		List<String> windo2 = new ArrayList<>(windo1);
		
		String tabs2 = windo2.get(1);
		
		System.out.println("Tabs 2 Unique Code is: "+tabs2);
		
		driver.switchTo().window(tabs2);
		Thread.sleep(3000);
		System.out.println("New Message window button clicked");
		driver.quit();
		
		
		//fourth and link button
		WebDriver drive = new ChromeDriver();
		drive.get("https://vinothqaacademy.com/multiple-windows/");
		Thread.sleep(5000);
		drive.findElement(By.xpath("//a[text()='New Browser Tab Link']")).click();
		Thread.sleep(5000);
		
		Set<String> window1 = drive.getWindowHandles();
		List<String> window2 = new ArrayList<>(window1);
		
		String tabbs2 = window2.get(1);
		
		System.out.println("Tabbs 2 Unique Code is: "+tabbs2);
		
		drive.switchTo().window(tabbs2);
		drive.findElement(By.xpath("//input[@id='nameInput']")).sendKeys("Abrar");
		Thread.sleep(5000);
		String title2 = drive.getTitle();
		Thread.sleep(3000);
		System.out.println("Tabbs 2 title is: "+title2);
		
		drive.close();
		
		Thread.sleep(3000);
		
		drive.switchTo().window(tab1);
		
		drive.close();
	
	}
	
	public static void windowhandle() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://vinothqaacademy.com/multiple-windows/");
	
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
		
		Set<String> win1 = driver.getWindowHandles();
		List<String> win2 = new ArrayList<>(win1);
		
		
		String tab1 = win2.get(0);
		String tab2 = win2.get(1);
		String tab3 = win2.get(2);
		
		System.out.println("Main page tab Unique code is: "+tab1);
		System.out.println("Tab2 Unique Code is: "+tab2);
		System.out.println("Tab3 Unique Code is: "+tab3);
		
		WebElement element = driver.findElement(By.xpath("//button[@id='button1']"));
		element.getClass();
		System.out.println(element);
		
		Thread.sleep(3000);
	
		driver.switchTo().window(tab1);
		System.out.println(tab1);
		Thread.sleep(3000);
		driver.switchTo().window(tab2);
		System.out.println(tab1);
		System.out.println("Now switched to tab2");
		Thread.sleep(2000);
		driver.switchTo().window(tab3);
		System.out.println(tab1);
		System.out.println("Now switched to tab3");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Now tab3 closed");
		Thread.sleep(2000);
		driver.switchTo().window(tab2);
		System.out.println(tab1);
		driver.close();
		System.out.println("Now tab2 closed");
		driver.switchTo().window(tab1);
		System.out.println(tab1);
		System.out.println("Both tabs closed except Main tab");
	}
	
	public static void windowshandles() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://vinothqaacademy.com/multiple-windows/");
	
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		
		WebElement hover = driver.findElement(By.xpath("(//a[text()='Demo Sites'])[2]"));
		action.moveToElement(hover).perform();
		System.out.println("Mouse hover done through Demo sites");
		Thread.sleep(3000);
		
		WebElement hover1 = driver.findElement(By.xpath("(//a[text()='Practice Automation'])[2]"));
		action.moveToElement(hover1).perform();
		System.out.println("Mouse hover done through Practice Automation");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()='Mouse Event'])[2]")).click();
		System.out.println("Successfully clicked the Mouse Event");
		Thread.sleep(2000);
		
		driver.close();
	
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
//		windowshandtype1();
//		windowhandle();
		windowshandles();
		
	
	}
	

}
