import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 {

	static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    
	}		
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input)[1]")).sendKeys("kow");
		Thread.sleep(5000);
		List<WeElement> auto sug = driver.findElements(By.ByXPath("//span[contacints"))driver.navigate().back();
		driver.findElement(By.className(t1)).sendkeys("qspiders");
		Thread.sleep(5000);
		driver.quit();
}