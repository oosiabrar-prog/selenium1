package Selenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepick {
		
	public static void simpledate() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		String dt = "15";
		String mon = "April";
		String yrs = "2026";
		
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		
		Thread.sleep(3000);
		
		WebElement fram = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(fram);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
			while(true) {
			
			String monyrs = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			Thread.sleep(2000);
			
			String[] split = monyrs.split(" ");
			
			String month = split[0];
			String year = split[1];
			
			System.out.println(monyrs);
			
				if(month.equalsIgnoreCase(mon) && year.equals(yrs)) {
				
					break;
				}
				else {
				
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				}
			
			}
			Thread.sleep(2000);
			
			List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
			
			Thread.sleep(2000);
			
			for(WebElement element: alldates) {
				
				String finddate = element.getText();
				
				if(finddate.equals(dt)) {
					
					element.click();
					break;
					
				}
			}

	}
	
	public static void icondate() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		String dt = "5";
		String mon = "october";
		String yrs = "2025";
		
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@id='Icon Trigger']")).click();
		Thread.sleep(2000);
		
		WebElement fram = driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[3]"));
		driver.switchTo().frame(fram);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		
			while(true) {
			
			String monyrs = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			Thread.sleep(2000);
			
			String[] split = monyrs.split(" ");
			
			String month = split[0];
			String year = split[1];
			
				if(month.equalsIgnoreCase(mon) && year.equals(yrs)) {
				
					break;
				}
				else {
				
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				}
			
			}
			Thread.sleep(2000);
			
			List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
			
			Thread.sleep(2000);
			
			for(WebElement element: alldates) {
				
				String finddate = element.getText();
				
				if(finddate.equals(dt)) {
					
					element.click();
					break;
					
				}
			}
			System.out.println(dt);

	}
	
	public static void main(String[] args) throws InterruptedException {
		
//		simpledate();
		icondate();
	}
}
	
	
		



