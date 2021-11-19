package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test3 {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Madan Jangid\\Documents\\eclipseMaterial\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.eazydiner.com/");
	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//html")).click();

		
		
		
		driver.findElement(By.xpath("//*[@id=\"home-search\"]")).sendKeys("Barbeque Nation",Keys.ENTER);
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//html")).click();

	
		

}
}