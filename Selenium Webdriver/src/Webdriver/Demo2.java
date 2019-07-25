package Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium Jar\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		//ChromeDriver driver= new ChromeDriver();
        
        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();
        WebElement UN=driver.findElement(By.name("userName"));
        if(UN.isEnabled())
        {
        	UN.sendKeys("Maria");
        	Thread.sleep(3000);
        }
        
        if(driver.findElement(By.name("userName")).isDisplayed())
        			{
        		    System.out.println(UN.getAttribute("value"));
        			}
        driver.quit();
        	
       

	}

}
