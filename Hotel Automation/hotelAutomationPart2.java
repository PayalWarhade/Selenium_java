// WebDriver script till the search page is filled with the information .

package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
		
public class hotelAutomationPart2 {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","E:\\selenium_files\\driver\\chromedriver_win32\\chromedriver.exe"); //path for the chromedriver
			 WebDriver driver = new ChromeDriver();
			 driver.get("http://www.adactinhotelapp.com/");                                           //launching a browser page 
			 
			 WebElement uname = driver.findElement(By.id ("username"));                           
			 uname.sendKeys("payalwarhade");                                    // get the username 
			 driver.findElement(By.id("password")).sendKeys("OL5BE3");          //get the password 
			 driver.findElement(By.id("login")).click();                        //for the click on login
			 
			 // Search Hotel page of an app will show after login successfully .
			 
			 new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");        
			 new Select(driver.findElement(By.id("hotels"))).selectByIndex(3);                       //select[@id='hotels']
			 new Select(driver.findElement(By.id("room_type"))).selectByIndex(2);                   //        room_type
			 new Select(driver.findElement(By.id("room_nos"))).selectByIndex(2);                   //select[@id='room_nos']
			 

			 WebElement date = driver.findElement(By.id ("datepick_in"));                  //to set checking date
			 date.click();                                                                 // to click on header of options 
			 date.clear();                                                                 // to clear the previous data 
			 date.sendKeys("11/04/2023");                                                  // giving the date to fix 
			 WebElement dat = driver.findElement(By.id ("datepick_out"));                  //to set checkout date, id="datepick_out"
			 dat.click();                                                                          
			 dat.clear();
			 dat.sendKeys("22/04/2023");                                                   // checkout date 
			 
			 new Select(driver.findElement(By.id("adult_room"))).selectByIndex(3);        //selecting by the element of index   
			 new Select(driver.findElement(By.id("child_room"))).selectByIndex(2);         
			
			 driver.findElement(By.id("Submit")).click();                                 //to click on submit 
			 
			 
			 //search for hotel page will be close  
			 
		}

	}

