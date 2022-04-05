// Webdriver script of browsing on webpage 


package test1;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
			
public class hotelAutomationPart1 {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","E:\\selenium_files\\driver\\chromedriver_win32\\chromedriver.exe"); //path for the chromedriver
     		 WebDriver driver = new ChromeDriver();
			 driver.get("http://www.adactinhotelapp.com/");                                           //launching a browser page 
				 
			 WebElement uname = driver.findElement(By.id ("username"));                           
			 uname.sendKeys("payalwarhade");                                    // get the username 
			 driver.findElement(By.id("password")).sendKeys("OL5BE3");          //get the password 
			 driver.findElement(By.id("login")).click();                        //for the click on login

	}
}
