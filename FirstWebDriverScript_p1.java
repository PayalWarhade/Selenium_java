// Automation selenium webdriver test case for adactinhotel app .

// automation till launching a browser page .

package test1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


	public class FirstWebDriverScript_p1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium_files\\driver\\chromedriver.exe");  // path of the chrome driver folder file 

		WebDriver driver = new ChromeDriver();                                                        // Instantiating objects and variables
		
		driver.get("http://adactinhotelapp.com/index.php");                         //Launching a Browser Session
  
	}
	

}
