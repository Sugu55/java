package workouts;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.amazon.in/");
		
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("Window.scrollBy(0,350)","");
		
		Thread.sleep(3000);
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Watch");
		
		WebElement s1 =driver.findElement(By.xpath("//input[@type='submit']"));
		s1.click();
		
		

		
		WebElement wenger=driver.findElement(By.xpath("//img[starts-with(@srcset,'https://m.media-amazon.com/images/I/61DZclqQ4RL._AC_UL320_.jpg 1x, https://m.media-amazon.com/images/I/61DZclqQ4RL._AC_UL480_FMwebp_QL65_.jpg 1.5x, https://m.media-amazon.com/images/I/61DZclqQ4RL._AC_UL640_FMwebp_QL65_.jpg 2x, https://m.media-amazon.com/images/I/61DZclqQ4RL._AC_UL800_FMwebp_QL65_.jpg 2.5x, https://m.media-amazon.com/images/I/61DZclqQ4RL._AC_UL960_FMwebp_QL65_.jpg 3x')]"));
		wenger.click();
	    String WinId=driver.getWindowHandle();
	    System.out.println("The Current window id :" +WinId);
	    Set<String>Win2=driver.getWindowHandles();
	   Win2.remove(WinId);
	   //String Winhandle=Win2.iterator().next();
	  // if(Winhandle!=WinId)
	   // {
	    //	driver.switchTo().window(Winhandle);
	    //}
	   for (String newwindow : Win2) 
	    {
			driver.switchTo().window(newwindow);
		}
	   

		WebElement cart=driver.findElement(By.xpath("//input[contains(@title,'Add to Shopping Cart')]"));
		cart.click();
	   
	    
	}
}
