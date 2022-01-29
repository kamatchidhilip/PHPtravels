package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POMprofile {
	
	@FindBy(name = "email")
	public static WebElement username;
	
	@FindBy(name ="password")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@class = 'btn-box pt-3 pb-4']//*")
	public static WebElement loginbtn;
	
	@FindBy(linkText = "My Profile")
	public static WebElement myprofile;

	@FindBy(name = "firstname")
	public static WebElement firstname;
	
	@FindBy(name ="lastname")
	public static WebElement lastname;
	
	@FindBy(name = "phone")
	public static WebElement phonenumber;
	
	@FindBy(name = "email")
	public static WebElement email;
	
	@FindBy(xpath = "//*[@class ='la la-star-of-life form-icon']//following::input")
	public static WebElement password1;
	
	@FindBy(xpath ="//*[@class= 'select2-search select2-search--dropdown']//input[1]")
	public static WebElement country;
	
	@FindBy(xpath = "//*[@class= 'select2-results']/ul/li[5]")
	public static WebElement albania;
	
	@FindBy(xpath = "//*[@class = 'la la-map-marker form-icon']//following::input[1]")
	public static WebElement state;
	
	@FindBy(xpath="//*[@class = 'la la-map-marker form-icon']//following::input[2]")
	public static WebElement city;
	
//	@FindBy(xpath ="//*[@class ='btn-box mt-4']//following::button")
	//public static WebElement update;
	


}
