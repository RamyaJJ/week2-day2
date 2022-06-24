package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 
		//2. Enter UserName and Password Using Id Locator
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		//3. Click on Login Button using Class Locator
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		//4. Click on CRM/SFA Link
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		
		//5. Click on Leads Button
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		
		//6. Click on Create Lead 
		WebElement CreateLead = driver.findElement(By.linkText("Create Lead"));
		CreateLead.click();
		
		//7. Enter CompanyName Field Using id Locator
		WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		CompanyName.sendKeys("HP");
		
		//8. Enter FirstName Field Using id Locator
		WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.sendKeys("Ramya");
		
		//9. Enter LastName Field Using id Locator
		WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
		LastName.sendKeys("J");
		
		//10. Enter FirstName(Local) Field Using id Locator
		WebElement LocalFirstName = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		LocalFirstName.sendKeys("Ramya");
		
		//11. Enter Department Field Using any Locator of Your Choice
		WebElement DeptField = driver.findElement(By.name("departmentName"));
		DeptField.sendKeys("IT");
			
		//12. Enter Description Field Using any Locator of your choice 
		WebElement DescField = driver.findElement(By.name("description"));
		DescField.sendKeys("I love working here");
		
		//13. Enter your email in the E-mail address Field using the locator of your choice
		WebElement MailField = driver.findElement(By.id("createLeadForm_primaryEmail"));
		MailField.sendKeys("ramya@gmail.com");
		
		//14. Select State/Province as NewYork Using Visible Text
		Select Place = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		Place.selectByVisibleText("Alaska");
		
		//15. Click on Create Button
		WebElement CreateButton = driver.findElement(By.className("smallSubmit"));
		CreateButton.click();
		
		//16. Click on edit button
		WebElement EditButton = driver.findElement(By.linkText("Edit"));
		EditButton.click();
		
        //17. Clear the Description Field clear
		WebElement UpdateDescField = driver.findElement(By.id("updateLeadForm_description"));
		UpdateDescField.clear();
		
        //18. Fill ImportantNote Field with Any text
		WebElement ImpField = driver.findElement(By.id("updateLeadForm_importantNote"));
		ImpField.sendKeys("I am happy");
		
        //19. Click on update button 
		WebElement UpdateButton = driver.findElement(By.name("submitButton"));
		UpdateButton.click();
		
		//20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		System.out.println("The title is "+ driver.getTitle());
	}
}

