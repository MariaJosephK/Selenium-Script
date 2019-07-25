package Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

		public class Demo7 {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\selenium Jar\\chromedriver.exe");
		        WebDriver driver= new ChromeDriver();
				//ChromeDriver driver= new ChromeDriver();
		        
		        driver.get("https://opensource-demo.orangehrmlive.com/");
		        driver.manage().window().maximize();
		              
		        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		        WebElement el=driver.findElement(By.id("btnLogin"));
		        Actions act=new Actions(driver);
//		        Action mouseover = act.moveToElement(el).build();
//		        mouseover.perform();
//		        act.sendKeys(el,(Keys.ENTER)).build().perform();
		        act.sendKeys(Keys.ENTER).build().perform();
		        Thread.sleep(3000);
		        //act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();
		       
		        

	}

}
