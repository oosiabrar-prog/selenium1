package Selenium_package;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class screenshot {
	
	public static void main(String[] args) throws IOException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Using TakesScreenshot method to take screenshot
//		TakesScreenshot ts = (TakesScreenshot) driver;
		
//		File src = ts.getScreenshotAs(OutputType.FILE);
		
//		File dest = new File(".\\Screenshot\\pic1.png");
	
//		FileUtils.copyFile(src, dest);
	
		//Using Webelement to take particular screenshot of image or icon
//		WebElement section = driver.findElement(By.xpath("//h1[text()='Selenium - Automation Practice Form']"));
//		
//		File src1 = section.getScreenshotAs(OutputType.FILE);
//		
//		File dest1 = new File(".\\Screenshot\\pic2.png");
//		
//		FileUtils.copyFile(src1, dest1);
//		
		//Using Robot method to take Screenshot
		Robot rb = new Robot();
		
		Rectangle ss = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		
		BufferedImage sc = rb.createScreenCapture(ss);
		
		ImageIO.write(sc, "png", new File(".\\Screenshot\\pic3.jpg"));
		
	
	}
}
