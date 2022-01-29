package testcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;

import commonfiles.Commonfiles;
import pageobject.POMprofile;


public class testcase extends Commonfiles {
	ExtentTest testcase;
	
	static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(testcase.class);
	
	
	public void login() throws IOException{
		
		
		logger.info("login started");
		PageFactory.initElements(driver, POMprofile.class);
		
		logger.info("Enter the username");
		POMprofile.username.sendKeys("user@phptravels.com");
		
		logger.info("Enter the password");
		POMprofile.password.sendKeys("demouser");
		
		logger.info("login button clicked");
		POMprofile.loginbtn.click();
		
		logger.info("Going to myprofile");
		POMprofile.myprofile.click();
		
		logger.info("Entered firstname");
		POMprofile.firstname.clear();
		POMprofile.firstname.sendKeys("priya");
		
		logger.info("Entered lastname");
		POMprofile.lastname.clear();
		POMprofile.lastname.sendKeys("Ram");
		
		logger.info("Entered phonenumber");
		POMprofile.phonenumber.clear();
		POMprofile.phonenumber.sendKeys("9765423263");
		
		logger.info("Entered emailid");
		POMprofile.email.clear();
		POMprofile.email.sendKeys("phi@gamil.com");
		
		logger.info("Entered password");
		POMprofile.password1.clear();
		POMprofile.password1.sendKeys("kdajshk");
		
		logger.info("selected country");
		POMprofile.country.click();
		logger.info("Albania selected");
		POMprofile.albania.click();
		
		logger.info("Entered state");
		POMprofile.state.sendKeys("Tamilnadu");
		
		
		logger.info("Entered city");
		POMprofile.city.sendKeys("chennai");
		
		
		// logger.info("update button clicked");
		//POMprofile.update.click();

	}
@Test
public void loginphp() throws IOException {
	testcase = extent.createTest("loginphp");
	testcase.log(Status.INFO, "Passed");
	extent.flush();

		logger.info("START");
	login();
	
}
driver.quit();	

	
}
