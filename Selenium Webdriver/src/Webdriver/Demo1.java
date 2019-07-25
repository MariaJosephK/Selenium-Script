package Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium Jar\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		//ChromeDriver driver= new ChromeDriver();
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        String t="OrangeHRM";
        
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
        if(driver.getTitle().equals(t))
        {
        	driver.findElement(By.id("welcome")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
        	//driver.close();
        	driver.quit();
        	
        }
        
        else
        	System.out.println("Actual and expected mismatch");
        
      /*  System.setProperty("webdriver.gecko.driver", "C:\\selenium Jar\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
		//ChromeDriver driver= new ChromeDriver();
*/	}

}
