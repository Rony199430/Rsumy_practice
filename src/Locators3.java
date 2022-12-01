import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HRF Services Corp\\Documents\\selenium udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// sibling - child to parents traverse 
		
		//absolute xpath(from root of html, and single /), problem is it can get very big also if anyone changes in between then x path would not work
		//to relative xpath 
		
		// (//header/div/button[1]/following-sibling::button [1] ) parent and sibling traversing in this example 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText()); //parent and sibling traversing in this example
			// child to parent //header/div/button[1]/parent::tagname
			// traversing from child to parent is not possible is CSS 
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText()); //same outcome ase line 19, except child to parent traverse 
		driver.quit(); 
		
		
		
	}

}
