package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import pageEvents.Home;
import pageObjects.Pom_AdminPage;

public class Baseclass {

	public static WebDriver driver;
	public static Properties prop;
	Pom_AdminPage Ad;
	Pom_AdminPage AD ;
	public void intialization() {
		readPropertyFile();
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));


	}
	public  void editJob_tab() throws InterruptedException {
		AD=new Pom_AdminPage(driver);
		// TODO Auto-generated method stub
		
			AD.Edit_JOb_tab();
	}
		
	
	

	public  void AccessJob_tab() {
		AD=new Pom_AdminPage(driver);
		// TODO Auto-generated method stub
		try {
			AD.JOb_tab();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void bulkoperations() {
		AD=new Pom_AdminPage(driver);
		//AD.Bulk_operations();
		
		AD.chckbox1_sel();
		AD.Del_select();
		AD.No_cancl();
	}
	public  void P_grades() throws InterruptedException {
		AD=new Pom_AdminPage(driver);
		// TODO Auto-generated method stub
		AD.payGrade_tab();	
	}
	public  void Currency_add() throws InterruptedException {
		AD=new Pom_AdminPage(driver);
		// TODO Auto-generated method stub
		AD.Cur_add();	
	}

	public void clickmodule(String UserName, String EmployeeName) throws InterruptedException {
		Ad=new Pom_AdminPage(driver);
		Ad.user_mt_tab();
		Ad.users_tb();
		Thread.sleep(2000);
		Ad.username_field(UserName);
		Thread.sleep(2000);
		Ad.EmpName_field(EmployeeName);
		Actions KeyDown1=new Actions(driver);
		KeyDown1.sendKeys(Keys.chord(Keys.DOWN)).perform();
		Thread.sleep(2000);
		Ad.selec_status();
		Ad.select_userrole();

		Thread.sleep(2000);
		Ad.submit_tab();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}


	}
	public Home  OpenAdmintab() {
		driver.findElement(By.xpath("//a[contains(@href,'viewAdminModule')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Home();
	}

	public Home login() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Home();
	}
	public void teardown() {
		driver.quit();
	}

	private void readPropertyFile() {
		prop=new Properties();
		String proppath="./src/main/java/config/config.properties";
		// TODO Auto-generated method stub
		FileInputStream fis;
		try {
			fis=new FileInputStream(proppath);
			prop.load(fis);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();	
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
