
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    
	}		
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/jpm/HTNL%20Files/P1.html");
		driver.findElement(By.name("link1")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(By.className(t1)).sendkeys("qspiders");
		Thread.sleep(5000);
		driver.quit();
}
}
