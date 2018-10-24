package BasicPracticals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingGmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vicky\\Java\\Sample\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		String title = driver.getTitle();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		System.out.println(title);
		driver.close();
		
		
	}

}
