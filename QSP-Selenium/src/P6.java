import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {

	static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();
}
}