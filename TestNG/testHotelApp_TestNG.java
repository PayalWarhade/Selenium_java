

package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class testHotelApp_TestNG {
	public static WebDriver driver;
  @Test
  public void TestHotelApp() {
	  System.setProperty("webdriver.chrome.driver", "E:\\selenium_files\\driver\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https:\\adactinHotelapp.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Opening Chrome window");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  System.out.println("Closing Chrome Browser");
  }

}