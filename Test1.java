package selenium;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Madan Jangid\\Documents\\eclipseMaterial\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.eazydiner.com/");
	
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//html")).click();

		
		driver.findElement(By.xpath("//*[@id=\"login-btn\"]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form-mobile\"]/div[1]/div/input")).sendKeys("9664424359");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"form-mobile\"]/div[3]/button")).click();

		driver.findElement(By.xpath("//*[@id=\"form-otp\"]/div[2]/div/input")).sendKeys("6117");

		driver.findElement(By.xpath("//*[@id=\"form-otp\"]/div[3]/div/button")).click();

	

	//	ChromeOptions p = new ChromeOptions();
		//p.addArguments("--disable-notifications");
		//driver.findElement(By.xpath("//*[@id=\"signup\"]")).click();


}
}