package Selenium_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollmethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		drive.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Using Scroll down
		JavascriptExecutor js = (JavascriptExecutor)drive;
		
		js.executeScript("window.scrollBy(0,800);");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-800);");
		
		//Using WebElements
		
		Thread.sleep(3000);
		
		WebElement element = drive.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
		
		js.executeScript("arguments[0].scrollIntoView(false);", element);
		
		//Direct scroll to bottom of webpage
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		
		//click option using Javascript
		
		WebElement element1 = drive.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		js.executeScript("arguments[0].click();", element1);
		
		
		WebElement element2 = drive.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].value='Abrar';", element2);
		
		
	}

}
