package cks;

import java.sql.Driver;
import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login {
	 	WebDriver driver;
	 	@DataProvider(name = "login")
		public static Object[][] credentials() {
			return new Object[][] {{" " ," " }, { "abc", "Test@123" }, { "def", "123@Test" }};
		}
	 
		@Test(dataProvider = "login")	 
 void browser(String username,String pass) throws InterruptedException {
		 System.out.println("launching chrome browser.........."); 
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
			   
		 driver.get("https://expatonline.hrblock.com/login");
		 
		 String currenturl=driver.getCurrentUrl();
		 System.out.println("currenturl"+ currenturl); 
		 
		 System.out.println("enter username : "+username); 
		 
		 WebElement user= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/div/div[1]/div/div/div[2]/form/div/div[2]/input"));
		 user.sendKeys(username);
		
		 System.out.println("enter password : "+pass);
		 Thread.sleep(2000);
		 
		 WebElement ps= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/div/div[1]/div/div/div[2]/form/div/div[5]/input"));
		 ps.sendKeys(pass);
		
		 System.out.println("click login  button ");
		
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/div/div[1]/div/div/div[2]/form/div/button/div/div")).click();
		 Thread.sleep(5000);
		
		 String userloginurl=driver.getCurrentUrl();
		 System.out.println(userloginurl);
		 
		 Thread.sleep(2000);
		 if (userloginurl=="https://expatonline.hrblock.com/authentication")
// if(userloginurl==currenturl) {
//	 System.out.println("user cannot login.");
//	 System.out.println("invalid credentials....");
//	 
// }else {
//	 System.out.println(" login scuessfully.");
//	 
// }
//	  
		 
		 driver.close();
		 System.out.println("browser closing.......  ");
		}
}
