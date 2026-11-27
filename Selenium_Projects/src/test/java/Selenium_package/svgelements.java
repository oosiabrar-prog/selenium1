package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class svgelements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='svg-container']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		Thread.sleep(2000);
		
		WebElement circle = driver.findElement(By.xpath("//*[local-name()='circle' and @fill='red']"));
		String color = circle.getAttribute("fill");
		System.out.println("The color of Circle is: "+color);
		Thread.sleep(2000);
		
		WebElement rect = driver.findElement(By.xpath("//*[local-name()='rect' and @fill='green']"));
		String rectangle = rect.getAttribute("fill");
		System.out.println("The color of Rectangle is: "+rectangle);
		Thread.sleep(2000);
		
		WebElement tri = driver.findElement(By.xpath("//*[local-name()='polygon' and @fill='blue']"));
		String triangle = tri.getAttribute("fill");
		System.out.println("The color of Triangle is: "+triangle);
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
}
