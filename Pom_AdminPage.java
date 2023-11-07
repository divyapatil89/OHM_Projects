package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import base.Baseclass;

public class Pom_AdminPage extends Baseclass {
	@FindBy(xpath="//span[text()='User Management ']")
	private WebElement User_management;

	@FindBy(xpath="//Li/a[text()='Users']")
	private WebElement users;

	@FindBy(xpath=("(//input[@class='oxd-input oxd-input--active'])[2]"))
	private WebElement User_name;

	@FindBy(xpath="//div[@class='oxd-autocomplete-text-input--before']/following-sibling::input")
	private WebElement Employee_name;

	//input[@id='Email']

	@FindBy(xpath="(//div[text()='-- Select --'])[1]")
	private WebElement User_role;

	@FindBy(xpath="\"//div[text()='Admin']\"")
	private WebElement Admin_value;


	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")
	private WebElement status;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;

	@FindBy(xpath="//span[text()='Job ']")
	private WebElement Job;
//
	@FindBy(xpath="//Li/a[text()='Job Titles']")
	private WebElement Job_title;
	
	@FindBy(xpath=("(//i[@class='oxd-icon bi-pencil-fill'])[1]"))
	private WebElement Pencil_jobEdit;
	
	@FindBy(xpath=("(//input[@class='oxd-input oxd-input--active'])[2]"))
	private WebElement JobTitle_name;
	
	@FindBy(xpath=("(//div//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[1]"))
	private WebElement Job_description;
	
	@FindBy(xpath=("(//div//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[2]"))
	private WebElement Job_note;
	
	@FindBy(xpath=("//button[@type='submit']"))
	private WebElement JobDetails_submit;
	//driver.findElement(By.xpath("")).click();

	
//driver.findElement(By.xpath("")).sendKeys("sales222");
//	Thread.sleep("2000");
//driver.findElement(By.xpath("")).sendKeys("This is the descritption about job title");
//	Thread.sleep(2000);
	//driver.findElement(By.xpath("")).sendKeys("This is the note in job title");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@type='submit']")).click();

	@FindBy(xpath=("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[2]"))
private WebElement Checkbox1;

	@FindBy(xpath="(//i[@class='oxd-icon bi-trash'])[2]")
private WebElement Delete_selectedcheckbox1;

	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
private WebElement YesPermission_delete;

	@FindBy(xpath="//li//a[text()='Pay Grades']")
	private WebElement Pay_grades;

	@FindBy(xpath="//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement pay_add;

	@FindBy(xpath="(//div/input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement pay_add_name;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement Pay_grade_submit ;
	
	  @FindBy(xpath = "(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]")
	    private WebElement chckbox1 ;

	    @FindBy(xpath = "//button[text()=' Delete Selected ']")
	    private WebElement Del_selected;

	    @FindBy(xpath = "(//button[text()=' No, Cancel '])")
	    private WebElement No_cancel;

	    
	   //  POM_BulkOperations(WebDriver driver) {
	    //    PageFactory.initElements(driver, this);
	    //}

	  

	public Pom_AdminPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement Currency_add ;
	
	@FindBy(xpath="//div[text()='-- Select --']")
	private WebElement Currency_select ;
	
	@FindBy(xpath="(//div/input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement MIN_sal ;
	
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[4]")
	private WebElement MAX_sal ;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Cur_submit  ;

	public void user_mt_tab(){
		User_management.click();
	}
	public void Cur_add() throws InterruptedException{
		Currency_add.click();
		
		Currency_select.click();
		
		Actions KeyDown2=new Actions(driver);
		KeyDown2.sendKeys(Keys.chord(Keys.DOWN)).perform();
		Thread.sleep(4000);
	
		MIN_sal.sendKeys("100");
		Thread.sleep(3000);
		//MAX_sal.sendKeys("10000");
		Thread.sleep(2000);
		Cur_submit.click();
			}
	public void Edit_JOb_tab() throws InterruptedException {
		Job.click();

		Job_title.click();
		
		Pencil_jobEdit.click();
		
		Thread.sleep(4000);
		
		JobTitle_name.sendKeys("sales222");
		
		Job_description.sendKeys("This is the descritption about job title");
		
		Job_note.sendKeys("This is the note in job title");
		
		JobDetails_submit.click();
	}
	public void JOb_tab() throws InterruptedException{
		Job.click();

		Job_title.click();

		Checkbox1.click();

		Delete_selectedcheckbox1.click();

		YesPermission_delete.click();
	

	}
	public void payGrade_tab() throws InterruptedException{
		
		Job.click();
		Pay_grades.click();
		Thread.sleep(1000);
		pay_add.click();
		Thread.sleep(1000);
		pay_add_name.sendKeys("Grad 150");
		Thread.sleep(1000);
		Pay_grade_submit.click();
		Thread.sleep(1000);

	}

	public void users_tb() {
		users.click();
	}
	public void username_field(String UserName) {
		User_name.sendKeys(UserName); 
		}
	public void EmpName_field(String EmployeeName) {
		Employee_name.sendKeys(EmployeeName);
	}
	public void select_userrole() throws InterruptedException {
		User_role.click();
		Actions KeyDown=new Actions(driver);
		KeyDown.sendKeys(Keys.chord(Keys.DOWN)).perform();
		Thread.sleep(2000);


	} 

	public void selec_status() throws InterruptedException {
		status.click();
		Actions KeyDown1=new Actions(driver);
		KeyDown1.sendKeys(Keys.chord(Keys.DOWN)).perform();
		Thread.sleep(2000);
		
	}
	public void submit_tab() {
		submit.click();
	}
	  public void chckbox1_sel() {
	    	chckbox1.click();
	    }
	    
	    public void Del_select() {
	    	Del_selected.click();
	    }
	    public void No_cancl() {
	    	No_cancel.click();
	    }
	   



}
