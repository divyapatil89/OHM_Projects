package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageEvents.Home;
import pageObjects.Pom_AdminPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Verify_job_test  extends Baseclass{
	WebDriver driver;
	Verify_job_test Ver_job;
	Pom_AdminPage AD;



	@Test(priority=2)
	public void Edit_jobTitles() throws InterruptedException {
		
		Ver_job.editJob_tab();
		System.out.println("here we are editing job details by clicking on pencil icon");

	}
	@Test(priority=1)
	public void delete_job() throws InterruptedException {
		
		Ver_job.AccessJob_tab();
		Thread.sleep(2000);  
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {

		Ver_job=new Verify_job_test();
		Ver_job.intialization();
		Ver_job.login();
		Ver_job.OpenAdmintab();
		Thread.sleep(1000);

	}

	@AfterTest
	public void afterTest() {
		Ver_job.teardown();
	}

}
