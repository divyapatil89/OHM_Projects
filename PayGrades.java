package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageEvents.Home;
import pageObjects.Pom_AdminPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class PayGrades extends Baseclass {
	
	WebDriver driver;
	PayGrades Pay_gd;
	Pom_AdminPage AD;
	
	
	
  @Test
  public void payGrade() throws InterruptedException {
	 
	  Pay_gd.P_grades();
	  Thread.sleep(2000);
	  Pay_gd.Currency_add();
	//  AD.payGrade_tab(s);
	  Thread.sleep(2000);
	  
  }
  @BeforeMethod
  
	  public void browsersetup() throws InterruptedException {
	  Pay_gd=new PayGrades();
	  Pay_gd.intialization();
	  Pay_gd.login();
	  Pay_gd.OpenAdmintab();
		 Thread.sleep(2000);
		  
		 
  }

  @AfterMethod
  public void afterMethod() {
	 Pay_gd.teardown();
  }


  
}
