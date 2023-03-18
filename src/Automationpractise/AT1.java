package Automationpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT1 
{
	public static WebDriver driver;

	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement serach=driver.findElement(By.name("q"));
		serach.sendKeys("Thalapathy"+Keys.ENTER);
		
		

	}

}
