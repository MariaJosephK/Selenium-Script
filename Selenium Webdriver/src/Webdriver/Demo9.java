package Webdriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

		public class Demo9 {

			public static void main(String[] args) throws InterruptedException, AWTException {
				System.setProperty("webdriver.chrome.driver", "C:\\selenium Jar\\chromedriver.exe");
		        WebDriver driver= new ChromeDriver();
				//ChromeDriver driver= new ChromeDriver();
		        
		        driver.get("http://realestate.upskills.in/admin");
		        driver.manage().window().maximize();
		              
		        driver.findElement(By.id("user_login")).sendKeys("admin");
		        driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		        driver.findElement(By.name("login")).click();
		        WebElement link=driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		        Actions act=new Actions(driver);
		        act.contextClick(link).build().perform();
		        Robot robot = new Robot();
		        robot.keyPress(KeyEvent.VK_DOWN);
		        Thread.sleep(3000);
		        robot.keyPress(KeyEvent.VK_ENTER);
	}

}
