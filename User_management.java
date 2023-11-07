package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Baseclass;

public class User_management extends Baseclass {
	public User_management  SearchUsers(String username, String Empname) {
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(username); 
		WebElement Userrole=driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		driver.findElement(By.xpath("//div[text()='Admin']")).click();
	//	Userrole.click();

	
//

		
	//	s.selectByVisibleText("Admin");

		WebElement usernm=driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input--before']/following-sibling::input"));
		usernm.sendKeys(Empname);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select s2=new Select(usernm);
		s2.selectByIndex(0);
		
		
		WebElement status=driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
		Select s1=new Select(status);
		s1.selectByValue("Enabled");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new User_management();


	}

}
