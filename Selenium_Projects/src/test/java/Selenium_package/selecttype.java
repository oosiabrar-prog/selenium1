package Selenium_package;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selecttype {
	
	public static void singleselect() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/dropdown#google_vignette");
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(4000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
		js.executeScript("arguments[0].scrollIntoView(false);", dropdown);
		
		Thread.sleep(4000);
		
		Select select = new Select(dropdown);
		
//		System.out.println("Displayed: "+dropdown.isDisplayed());
//		System.out.println("Enabled: "+dropdown.isEnabled());
		
//		select.selectByIndex(4);
//		select.selectByValue("AX");
//		select.selectByVisibleText("Angola");
		
		List<WebElement> options = select.getOptions();
		
		for (int i = 1; i < options.size(); i++) {
			
		    select.selectByIndex(i);
		    
		    System.out.println(options.get(i).getText());
		}

	}
	
	public static void multiselect() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(3000);
		
		WebElement multiple = driver.findElement(By.xpath("//select[@id='colors']"));
		js.executeScript("arguments[0].scrollIntoView(false);", multiple);
		
		Thread.sleep(3000);
		
		Select select = new Select(multiple);
		
		System.out.println(select.isMultiple());
		
		select.selectByIndex(0);
		select.selectByValue("blue");
		select.selectByVisibleText("Green");
		
		Thread.sleep(3000);
		
		select.deselectByIndex(1);
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
	public static void multipleselecttype() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement multiple = driver.findElement(By.xpath("//input[@id='demo-multiple-select-input']/following-sibling::span"));

//		WebElement multiple = driver.findElement(By.xpath("//span[@class='mbsc-textfield-tags mbsc-ios mbsc-ltr  mbsc-textfield mbsc-textfield-outline mbsc-select mbsc-textfield-stacked mbsc-textfield-outline-stacked mbsc-textarea']"));
		Thread.sleep(3000);
		multiple.click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()='Movies, Music & Games']")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='Books']"));
		element.sendKeys("Books");

		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
//		multiselect();
		multipleselecttype();
	}

}
