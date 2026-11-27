package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#firstName")).sendKeys("Abrar");
//		driver.findElement(By.cssSelector("#lastName")).sendKeys("Ahmed");
//		driver.findElement(By.cssSelector(".gender")).sendKeys("Male");
//		driver.findElement(By.cssSelector(".city")).sendKeys("Chennai");
//		driver.findElement(By.cssSelector("input[placeholder='Country']")).sendKeys("India");
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("input[placeholder='Enter your security question']")).sendKeys("What is your first school name?");
//		driver.findElement(By.cssSelector("input[placeholder='Enter your security answer']")).sendKeys("Alhuda Matriculation school");
//		driver.findElement(By.cssSelector(".container [placeholder='Verify your personal details']")).sendKeys("All details true");
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("(//input[@name='Gender'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Abrar");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Ahmed");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("abrar@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
