package java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class venki {

	public static void main(String[] args) {
		
      WebDriver driver = new ChromeDriver();
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      
	}

}
