package Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium Jar\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		//ChromeDriver driver= new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("userName")).sendKeys("manzoor");
        driver.findElement(By.name("password")).sendKeys("manzoor");
        driver.findElement(By.name("login")).click();
        Thread.sleep(30000);
        if(driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
        {
        driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway'] ")).click();
        
        }
        WebElement DD=driver.findElement(By.name("passCount"));
        Select sel=new Select(DD);
        sel.selectByVisibleText("2");
        
        
        driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
        driver.findElement(By.name("findFlights")).click();
        driver.findElement(By.name("reserveFlights")).click();
        
        
        

	}

	
}
