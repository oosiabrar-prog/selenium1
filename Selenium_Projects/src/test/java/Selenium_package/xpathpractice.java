package Selenium_package;

import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		driver.get("https://demowebshop.tricentis.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@id='firstName']/ancestor::div[1]//input[@placeholder='First Name']")).sendKeys("Abrar");
//		driver.findElement(By.xpath("//input[@id='lastName']/ancestor::div[1]//input[@placeholder='Last Name']")).sendKeys("Ahmed");
//		driver.findElement(By.xpath("//div[label[text()='Gender']]/following-sibling::div/input")).sendKeys("Male");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='lastName']/ancestor::div[1]/following-sibling::div[1]//input")).sendKeys("Male");
//		driver.findElement(By.xpath("//input[@id='lastName']/ancestor::div[1]/following-sibling::div[contains(@class='gender')]//input")).sendKeys("Male");
//		driver.findElement(By.xpath("//input[@id='lastName']/following-sibling::input[1]")).sendKeys("Male");
	
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		
		boolean enabled = register.isEnabled();
		System.out.println(enabled);
		
		String name = "Register";
		String text2 = register.getText();
		System.out.println(text2);
		
		String attribute2 = register.getAttribute("class");
		System.out.println(attribute2);
		
		Point location = register.getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		
		Dimension size = register.getSize(); //ctrl+2+L
		System.out.println(size.getHeight()); 
		System.out.println(size.getWidth());
		
		
		
		
		
		
		
	}

}
