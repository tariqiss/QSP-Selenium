import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P19 {

			public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("https://www.vtiger.com");
				test

	}

}
