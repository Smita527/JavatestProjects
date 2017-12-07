package Browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Smita\\Downloads\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("smitad2002@gmail.com");
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[2]/div[1]/div/content/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Account123");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@id='passwordNext']//span[contains(text(),'Next')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://accounts.google.com/SignOutOptions?hl=en-GB&continue=https://mail.google.com/mail&service=mail']")).click();
	    driver.findElement(By.xpath("//a[@id='gb_71']")).click();
       
	}

}
