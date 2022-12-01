import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//invoking the browser 
		//Chrome - ChroemDriver -> method close get
		

		// ChromeDriver driver = new ChromeDriver(); 
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HRF Services Corp\\Documents\\selenium udemy\\chromedriver_win32\\chromedriver.exe");
		
	//webdriver.chrome.drive-->value of path
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); 
		// driver.quit();
		
	}

}
