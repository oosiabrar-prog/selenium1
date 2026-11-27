package Selenium_package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver drive = new ChromeDriver();
		drive.get("https://vinothqaacademy.com/alert-and-popup/");
		
		JavascriptExecutor js = (JavascriptExecutor)drive;
		
		//Alert
//				String title = (String)js.executeScript("return document.title;");
//				System.out.println(title);
//				String url = (String)js.executeScript("returnwindow.location.href;");
//				System.out.println(url);
//				js.executeScript("location.reload();");
//				System.out.println("Reloaded");
//				
//				drive.findElement(By.xpath("//button[text()='Alert Box']")).click();
//				Thread.sleep(1000);
//				Alert alert =drive.switchTo().alert();
//				Thread.sleep(2000);
//				alert.accept();
//				
//				Thread.sleep(2000);
//				
//				drive.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
//				Thread.sleep(1000);
//				Alert alert1 = drive.switchTo().alert();
//				Thread.sleep(2000);
//				System.out.println(alert1.getText());
//				Thread.sleep(3000);
//				alert1.dismiss();
//				
				Thread.sleep(2000);
				
				drive.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
				Thread.sleep(1000);
				Alert alert2 = drive.switchTo().alert();
				Thread.sleep(3000);
				alert2.sendKeys("yes");
				Thread.sleep(2000);
				System.out.println(alert2.getText());
				Thread.sleep(2000);
				alert2.dismiss();
//				Thread.sleep(2000);
//				drive.close();
//			
	}

}
