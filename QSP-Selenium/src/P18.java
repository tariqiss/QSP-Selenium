import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P18 {

	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.vtiger.com");
		WebElement w1 = driver.findElement(By.id("navbarDocumentation"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(w1).build().perform();

	}
	
}
