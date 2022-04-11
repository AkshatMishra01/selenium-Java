import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Lab\\More softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.className("_2IX_2-")).sendKeys("9027336366");
		driver.findElement(By.className("_3mctLh")).sendKeys("Gibberish");
		driver.findElement(By.className("_3AWRsL")).click();
		driver.close();
		
	}
}
