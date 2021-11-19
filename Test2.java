package selenium;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test2 {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Madan Jangid\\Documents\\eclipseMaterial\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.eazydiner.com/");
	
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//html")).click();

		
		driver.findElement(By.xpath("//*[@id='signup']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("Vijay Singh");
		
		driver.findElement(By.xpath("//*[@id=\"lname\"]")).sendKeys("Rathore");

		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[2]/div/div[1]/div/div/input")).sendKeys("8769327988");


		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[3]/div[1]/div/input")).sendKeys("sutharmadan004@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"signup-date\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[3]/div[2]/div/div/div/table[1]/tbody/tr/td[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[3]/div[2]/div/div/div/table[1]/tbody/tr/td[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[3]/div[2]/div/div/div/table[4]/tr[4]/td[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[3]/div[2]/div/div/div/table[3]/tr[3]/td[1]")).click();

		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[3]/div[2]/div/div/div/table[2]/tr[2]/td[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"send_otp\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"signup_submit\"]")).click();

		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		

}
}