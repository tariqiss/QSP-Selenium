import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	static {
	     System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    
	}		
	public static void main(String[] args) throws InterruptedException {
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.manage().deleteAllCookies();
		d1.get("https://www.naukri.com");
		Set<String> w1 = d1.getWindowHandles();
		System.out.println(w1);
		for(String a:w1)
		{
			System.out.println(a);
		}
		
	}

}

