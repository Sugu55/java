package Automationpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) 
	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demoSite/practice/autocomplete/combobox.html");
		WebElement input=driver.findElement(By.xpath("/html/body/div[1]/span/input"));
		input.sendKeys("p");

	}

}
