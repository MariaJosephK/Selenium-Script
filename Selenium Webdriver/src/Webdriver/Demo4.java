package Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium Jar\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		//ChromeDriver driver= new ChromeDriver();
        driver.get("http://elearning.upskills.in");
        driver.findElement(By.id("login")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin@123");
        driver.findElement(By.id("form-login_submitAuth")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a")).click();
        driver.findElement(By.id("user_import_import_file")).sendKeys("C:\\Users\\MariaK\\Desktop\\defect.xlsx");
        
	}
}
