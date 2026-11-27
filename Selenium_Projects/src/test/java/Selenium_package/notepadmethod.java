package Selenium_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class notepadmethod {
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//h1[text()='Selenium - Automation Practice Form']"));
		
		String text = ele.getText();
		
//		String text = "This is a Notepad Method Class";
		
		StringSelection select = new StringSelection(text);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		Thread.sleep(2000);
		
		ProcessBuilder pb = new ProcessBuilder("Notepad.exe");
		pb.start();
		
		Robot rb = new Robot();
		
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_WINDOWS);
		rb.keyPress(KeyEvent.VK_UP);
		
		
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		rb.delay(2000);
		
		String filename = "new3.txt";
		
		for(char c : filename.toCharArray()) {
			
			int code = KeyEvent.getExtendedKeyCodeForChar(c);
			
			rb.keyPress(code);
			rb.keyRelease(code);
		}
		
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ALT);
		rb.keyPress(KeyEvent.VK_F4);
		rb.keyRelease(KeyEvent.VK_F4);
		rb.keyRelease(KeyEvent.VK_ALT);
		
		rb.delay(2000);
		
		driver.close();
	}

}
