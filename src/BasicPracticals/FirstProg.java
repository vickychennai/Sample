








package BasicPracticals;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstProg {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vicky\\Java\\Sample\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.close();
				
	
	}

}
