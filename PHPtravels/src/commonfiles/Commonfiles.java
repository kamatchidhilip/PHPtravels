package commonfiles;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Commonfiles {

	 public static WebDriver driver=null;
	 public static Properties properties=null;
	 protected ExtentReports extent;
	 ExtentHtmlReporter htmlreport;
	 ExtentTest testcase;
	 ExtentReports report;

	 org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Commonfiles.class);
	 
	 public Properties loadproperty() throws IOException {
		 
		FileInputStream fileinputstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;
	 }
	 
@BeforeSuite	 
public void  launchbrowser() throws IOException {
	PropertyConfigurator.configure("log4j.properties");
	htmlreport = new ExtentHtmlReporter("Extentreport1.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlreport);
	
	logger.info("PHPtravels website begins");
	logger.info("Loading the property");
	
	loadproperty();
	String browser = properties.getProperty("browser");
	String url = properties.getProperty("url");
	String driverlocation = properties.getProperty("driverlocation");
	String un = properties.getProperty("username");
	String pwd = properties.getProperty("password");

	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", driverlocation);
		logger.info("Launching the chrome");
		driver = new ChromeDriver();
	} 
	else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", driverlocation);
		logger.info("Launchig the firefox");
		driver =  new FirefoxDriver();	
	}
	
	driver.manage().window().maximize();
	logger.info("Navigating to url");
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
}
@AfterSuite
private void teardown() {
	logger.info("Closing the browser");
	extent.flush();
	driver.quit();

}
	 

}
