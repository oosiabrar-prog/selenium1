package Selenium_package;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandlingtask {
	
	public static void windowhandling() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		Thread.sleep(3000);
		
		Set<String> win1 = driver.getWindowHandles();
		List<String> win2 = new ArrayList<>(win1);
		
		
		String tab1 = win2.get(0);
		String tab2 = win2.get(1);
		String tab3 = win2.get(2);
		
		System.out.println("Main page tab Unique code is: "+tab1);
		System.out.println("Tab2 Unique Code is: "+tab2);
		System.out.println("Tab3 Unique Code is: "+tab3);
		
//		WebElement element = driver.findElement(By.xpath("//button[@id='button1']"));
//		element.getClass();
//		System.out.println(element);
		
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
		System.out.println("All tabs closed");
		driver.quit();
	
	}
	
	public static void actiontype() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.amazon.in/");
	
		Thread.sleep(3000);
	
		Actions action = new Actions(driver);
		
		WebElement hover = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		action.moveToElement(hover).perform();
		System.out.println("Mouse hover done in Amazon Sign In");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='/gp/css/homepage.html?ref_=nav_AccountFlyout_ya']")).click();
		System.out.println("Successfully clicked Your Account");
		Thread.sleep(2000);
		
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
//		windowhandling();
		actiontype();
		
	}

}
