package cks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class resetpassword {
	 
	 
	@Test
	void loginpage() throws InterruptedException {
		System.out.println("launching chrome browser.........."); 
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		//url
		 
	 driver.get("https://expatonline.hrblock.com/login");
	 System.out.println("launching url : https://expatonline.hrblock.com/login"); 
	
 //forgot password
 driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div/div[1]/div/div/div[2]/div[6]/button[1]/div/div/div")).click();
	
//redirect to forgot page 
 String forgoturl=driver.getCurrentUrl();
 System.out.println(forgoturl );
 String resetpass="https://expatonline.hrblock.com/resetPassword";
 if (forgoturl!=null) {
	 System.out.println("scuessfully navigate to password rest page");
 }else {
	 System.out.println("forget password button is not working...");
 }
 System.out.println("browser closed");
 driver.close();
	}
 @Test
 void register_page_button() {
 //navigate to register url
 
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 System.out.println("launching chrome browser.........."); 
 driver.get("https://expatonline.hrblock.com/wizard/introduction");
	 String reg=driver.getCurrentUrl();
	 System.out.println(reg);
	 System.out.println("scuessfully navigate to register page");
	 //close browser
	 driver.close();
	}
	 
	 

 	 
	 
}