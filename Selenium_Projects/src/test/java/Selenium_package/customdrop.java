package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customdrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Please select...']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='mbsc-scroller-wheel-item mbsc-ios mbsc-ltr mbsc-wheel-item-checkmark mbsc-wheel-item-multi'])[41]")).click();
		driver.findElement(By.xpath("(//div[@class='mbsc-scroller-wheel-item mbsc-ios mbsc-ltr mbsc-wheel-item-checkmark mbsc-wheel-item-multi'])[42]")).click();
		driver.findElement(By.xpath("(//div[@class='mbsc-scroller-wheel-item mbsc-ios mbsc-ltr mbsc-wheel-item-checkmark mbsc-wheel-item-multi'])[43]")).click();
		driver.findElement(By.xpath("(//div[@class='mbsc-scroller-wheel-item mbsc-ios mbsc-ltr mbsc-wheel-item-checkmark mbsc-wheel-item-multi'])[44]")).click();
		
		WebElement element = driver.findElement(By.xpath("//h6[text()='Multiselect drop down']"));
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.click(element).perform();
		
		driver.close();
	}

}
