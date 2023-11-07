package testcases;

import org.testng.annotations.Test;

import base.Baseclass;


import pageEvents.Home;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;

public class HoomeTest extends Baseclass {
	HoomeTest ht;
	Home hm;



	@Test(priority = 1,dataProvider = "dp")
	public void SearchUser(String UserName, String EmployeeName) throws InterruptedException {

		hm.clickmodule(UserName, EmployeeName);
		Thread.sleep(2000);
	}   					

	@Test(priority=2)
	public void Bulkoperations() {

		hm.bulkoperations();

	}
	@BeforeMethod                    
	public void browsersetup() {
		
		hm=new Home();  
		ht=new HoomeTest();
		hm.intialization();
		hm.login();
		hm.OpenAdmintab();

	}
	@AfterMethod
	public void close_browser(){
		hm.teardown();

	}
	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { "Admin", "Paul Collings" },
		};
	}


}
