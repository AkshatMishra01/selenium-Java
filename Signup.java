import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation Lab\\More softwares\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-signin-tooltip")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		
		driver.findElement(By.id("ap_customer_name")).sendKeys("Akshat Mishra");
		driver.findElement(By.id("ap_email")).sendKeys("9027336366");
		driver.findElement(By.id("ap_password")).sendKeys("ioioio");
		driver.findElement(By.id("ap_password_check")).sendKeys("ioioio");
		
		WebElement contButton = driver.findElement(By.id("continue"));
		contButton.submit();
		driver.close();
	}

}
