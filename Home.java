package pageEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Baseclass;
import pageObjects.Pom_AdminPage;

public class Home extends Baseclass {


	public void Bulk_operations() throws InterruptedException {
		
		

		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement scrolltoele = driver.findElement(By.xpath("(//div[text()='Enabled'])[6]"));

		js.executeScript("arguments[0].scrollIntoView();", scrolltoele);
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[13]//i")));
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele);

		System.out.println("pencil icon is clicked");

			
		Thread.sleep(3000);



	}
	
	
	



}
