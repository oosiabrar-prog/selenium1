package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class October_Project {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		String title = driver.getTitle();
//		System.out.println(title);
		driver.manage().window().maximize();
//        Thread.sleep(3000);
//        driver.manage().window().minimize();
//        Thread.sleep(3000);
//        driver.manage().window().fullscreen();
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        driver.navigate().refresh();
//        System.out.println(driver.getWindowHandle());
		
//		driver.findElement(By.className("ico-register")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("gender-male")).click();
//		driver.findElement(By.id("FirstName")).sendKeys("Raju");
//		driver.findElement(By.id("LastName")).sendKeys("Ram");
//		driver.findElement(By.id("Email")).sendKeys("rajuram@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("12345678");
//		driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
//		driver.findElement(By.id("register-button")).click();
//		Thread.sleep(3000);
//		driver.close();
		
		driver.findElement(By.id("name")).sendKeys("Abrar Ahmed");
		driver.findElement(By.id("email")).sendKeys("abrar@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("987654321");
		Thread.sleep(3000);
		driver.findElement(By.id("textarea")).sendKeys("Chennai, Tamil Nadu, India");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("monday")).click();
		
  
		}

}
 