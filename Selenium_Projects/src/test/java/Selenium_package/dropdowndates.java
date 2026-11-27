package Selenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowndates {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String date = "12";
		
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@id='DropDown DatePicker']")).click();
		Thread.sleep(2000);
		
		WebElement fram = driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[2]"));
		driver.switchTo().frame(fram);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		month.click();
		
		Select select = new Select(month);
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		year.click();
		
		Select select1 = new Select(year);
		
		select1.selectByIndex(9);
		
		Thread.sleep(2000);
		
		List<WebElement> alldates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		
		Thread.sleep(2000);
		
		for(WebElement element: alldates) {
			
			String finddate = element.getText();
			
			if(finddate.equals(date)) {
				
				element.click();
				break;
				
			}
		
		}
	}

}
