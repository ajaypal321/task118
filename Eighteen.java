package com.task.eighteen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eighteen {

	public static void main(String[] args) throws InterruptedException {
		//set the path a the chromediver
				System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver.exe");	
		// instance of chromedriver 
				WebDriver driver = new ChromeDriver();
				// time manage
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();
				// navigate to facebook
				driver.get("https://www.facebook.com/");
				
				// click on create new account button
				WebElement button=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
				button.click();
				Actions actions = new Actions(driver);
				//actions.click(button).build().perform();
				Thread.sleep(3000);
				//WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
				//firstname.sendKeys("Test");
				//actions.click(button).build().perform();
				
				 // Enter first name and last name
			        WebElement firstNameInput = driver.findElement(By.name("firstname"));
			        firstNameInput.sendKeys("Test");
			        WebElement lastNameInput = driver.findElement(By.name("lastname"));
			        lastNameInput.sendKeys("User");
			        //  Enter a valid email address
			        WebElement emailInput = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			        emailInput.sendKeys("testuser@test.com");
			        WebElement RemailInput = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
			        RemailInput.sendKeys("testuser@test.com");
			        //  Enter a valid password
			        WebElement password = driver.findElement(By.name("reg_passwd__"));
			        password.sendKeys("Test@12345");
			        // date of birth
			        WebElement dob = driver.findElement(By.name("birthday_day"));
			        
			       // actions.doubleClick(dob).build().perform();
			       dob.sendKeys("11");
			       // date of month
			        WebElement month = driver.findElement(By.name("birthday_month"));
			        month.sendKeys("May");
			        
			        // date of year
			        WebElement year = driver.findElement(By.name("birthday_year"));
			        year.sendKeys("1985");
			        // gender
			        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
			        gender.click();
			        
			        //Click on the "Sign Up" button
			        WebElement signUp = driver.findElement(By.name("websubmit"));
			        signUp.click();
			        
			        String Title = driver.getTitle();
			        if (Title.contains("Facebook")) {
			            System.out.println("Successfully registered and redirected to Facebook homepage");
			        } else {
			            System.out.println("Registration failed or redirection to homepage unsuccessful");
			        }

			        
	}

}
// RESULT
//Jul 05, 2023 3:50:26 PM org.openqa.selenium.remote.service.DriverService$Builder getLogOutput
//INFO: Driver logs no longer sent to console by default; https://www.selenium.dev/documentation/webdriver/drivers/service/#setting-log-output
//SLF4J: No SLF4J providers were found.
//SLF4J: Defaulting to no-operation (NOP) logger implementation
//SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
//Successfully registered and redirected to Facebook homepage
//UNABLE OT REGISTER