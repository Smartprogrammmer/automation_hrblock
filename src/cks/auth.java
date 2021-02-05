package cks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auth {
	public static void main(String args[]) throws InterruptedException {
		String username="sksaro64";
		String pass="Sarohrblock1436@";
	 
	System.out.println("launching chrome browser.........."); 
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	  System.out.println("launching url : https://expatonline.hrblock.com/login"); 
	  //url
 driver.get("https://expatonline.hrblock.com/login");
 String s1=driver.getCurrentUrl();
 System.out.println(s1);
 //username
 System.out.println("enter username : "+username); 
   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/div/div[1]/div/div/div[2]/form/div/div[2]/input")).sendKeys(username);;
Thread.sleep(2000);
  
 System.out.println("enter password : "+pass);
 Thread.sleep(2000);
 //password
WebElement ps= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/div/div[1]/div/div/div[2]/form/div/div[5]/input"));
Thread.sleep(2000);
ps.sendKeys(pass);
//click ;ogin
System.out.println("click login  ");
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/div/div[1]/div/div/div[2]/form/div/button/div/div")).click();
Thread.sleep(5000);
String s=driver.getCurrentUrl();
System.out.println(s);
Thread.sleep(1500);
if(s1!=s) {
	System.out.println("login scuessfully");
}else {
	System.out.println("invalid password");
}
}
}