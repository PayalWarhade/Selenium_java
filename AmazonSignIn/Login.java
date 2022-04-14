

package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium_files\\driver\\chromedriver_win32\\chromedriver.exe"); //path for the chromedriver
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/register");
		
	       
			 WebElement uname = driver.findElement(By.id ("ap_customer_name"));                           
			 uname.sendKeys("Payal");
			 driver.findElement(By.id("ap_phone_number")).sendKeys("8788995861"); 
			 driver.findElement(By.id("ap_email")).sendKeys("warhadepayal@gmail.com"); 
			 driver.findElement(By.id("ap_password")).sendKeys("#Payal98");          
			 driver.findElement(By.id("Continue")).click();                        
			 
			  
			 
		}

	}
