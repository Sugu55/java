package Automationpractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples 
{
    public static WebDriver driver;
	public static void main(String[] args) 
	{
		driver =new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/home.html");
		driver.findElement(By.linkText("Alert")).click();
		WebElement Alert=driver.findElement(By.xpath("//button[text()='Alert Box']"));
		Alert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement ConformBox=driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		ConformBox.click();
		Alert Conformalert=driver.switchTo().alert();
		Conformalert.dismiss();
		
		WebElement PromptBox=driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		PromptBox.click();
		Alert PromptAlert=driver.switchTo().alert();
		PromptAlert.sendKeys("Thalapathy");
		PromptAlert.accept();

	}

}
