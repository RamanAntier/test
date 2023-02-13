package test;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ComawariTestNG {
	
	@Test
	 public void login()
	 {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://stage.comawari.io/register");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[1]/div/form/div[1]/div[1]/div/div/div[2]/div/div/input")).sendKeys("tester");
		driver.findElement(By.name("username")).sendKeys("User1");
		
	
	 }
	@BeforeSuite
	
	public void resiter() {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://stage.comawari.io/register");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[1]/div/form/div[1]/div[1]/div/div/div[2]/div/div/input")).sendKeys("tester");
		driver.findElement(By.name("username")).sendKeys("User1");
		
	
         int number =(int)(Math.random() *205+ 1);
         String email="TestMyAccount"+number+"@mailinator.com";
         System.out.println(email);
        // Actions act=new Actions(driver);
         //act.sendKeys(Keys.ENTER).build().perform();
         driver.findElement(By.name("email")).sendKeys(email);
         driver.findElement(By.name("email")).click();
         
         //click on send OTP link
         driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[1]/div/form/div[1]/div[3]/div/div/div[2]/div/div/span")).click();
        // Thread.sleep(02000);
		
     
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.mailinator.com/");
		driver.getWindowHandles();
		//ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());// again switch to first tab and open new URL
		// System.out.println(tabs.size());
		
		
		 driver.findElement(By.id("search")).sendKeys(email);
       //  Thread.sleep(3000);
         driver.findElement(By.xpath("//*[@value='Search for public inbox for free']")).click();
       //.sleep(3000);
         driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr/td[2]")).click();
        // Thread.sleep(7000);
         driver.switchTo().frame(driver.findElement(By.xpath("//*[@name='html_msg_body']")));
        // Thread.sleep(1000);

        String otp= driver.findElement(By.xpath("/html/body/div/div/h2")).getText();
         System.out.println(otp);
         
         
         
         
         ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());// again switch to first tab and open new URL
		 System.out.println(tabs.size());
		  driver.switchTo().window(tabs.get(0));	
		  driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/form/div[1]/div[4]/div/div/div[2]/div/div/input")).sendKeys(otp);
		//  driver.quit();

		 
		//driver.quit();
	}

}
