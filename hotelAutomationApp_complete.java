//complete script for the Adactin hotel booking   

package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
			
public class hotelAutomationApp_complete {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","E:\\selenium_files\\driver\\chromedriver_win32\\chromedriver.exe"); //to set the chromedriver path
				 WebDriver driver = new ChromeDriver();
				 driver.get("http://www.adactinhotelapp.com/");
				 
				 // after login search page will be displayed ; first page  
				 
				 WebElement uname = driver.findElement(By.id ("username"));
				 uname.sendKeys("payalwarhade"); 
				 driver.findElement(By.id("password")).sendKeys("OL5BE3");
				 driver.findElement(By.id("login")).click();
				 
				 new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");        				 
				 new Select(driver.findElement(By.id("hotels"))).selectByIndex(3);                       //select[@id='hotels']				 
				 new Select(driver.findElement(By.id("room_type"))).selectByIndex(2);                   // room_type using indexNo
				 new Select(driver.findElement(By.id("room_nos"))).selectByIndex(2);                   //select[@id='room_nos']
				 
				 WebElement date = driver.findElement(By.id ("datepick_in"));                           // datepick_in
				 date.click();
				 date.clear();
				 date.sendKeys("11/04/2023");
				 WebElement dat = driver.findElement(By.id ("datepick_out"));                          // id="datepick_out"
				 dat.click();
				 dat.clear();
				 dat.sendKeys("22/04/2023");
				 
				 new Select(driver.findElement(By.id("adult_room"))).selectByIndex(3);
				 new Select(driver.findElement(By.id("child_room"))).selectByIndex(2);
				
				 driver.findElement(By.id("Submit")).click();
				
				 // selected hotel  will be displayed ; second page  
				 
				 driver.findElement(By.id("radiobutton_0")).click();                                   // id="radiobutton_0"              
				 driver.findElement(By.id("continue")).click();                                        // id="continue"
				 
				 //Book a hotel page will be displayed ; third page 
				 
				 WebElement name = driver.findElement(By.id ("first_name"));                           // id="first_name"
				 name.sendKeys("Sia");
				 
				 WebElement nam = driver.findElement(By.id ("last_name"));                             // id="last_name"
				 nam.sendKeys("Mishra");
				 
				 WebElement na = driver.findElement(By.id ("address"));                                // address
				 na.sendKeys("government society, Nagpur");
				 
				 WebElement n = driver.findElement(By.id ("cc_num"));                                // id="cc_num" ;card details 
				 n.sendKeys("1133557887664422");                                                     //card no
				 
				 new Select(driver.findElement(By.id("cc_type"))).selectByIndex(2);                // id="cc_type" ;card type
				 new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(4);           // id="cc_exp_month" ;card expire 
				 new Select(driver.findElement(By.id("cc_exp_year"))).selectByIndex(10);           // cc_exp_year ; expire year
				 WebElement cc = driver.findElement(By.id ("cc_cvv"));                             // id="cc_cvv" ; cvv of card
				 cc.sendKeys("123");                                                               //cvv of card
				 driver.findElement(By.id("book_now")).click();                                    // final booking  
				 driver.quit();
			}

		}
