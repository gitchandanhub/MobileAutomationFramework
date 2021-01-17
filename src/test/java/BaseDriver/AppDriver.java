package BaseDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class AppDriver
	{
	     public AndroidDriver driver = null;
	     public DesiredCapabilities capabilities;
	     public static Properties config = new Properties();
	     public static Logger log=Logger.getLogger("devpinoyLogger");
	     public static ExtentHtmlReporter htmlreporter;
	     public static ExtentReports extentreport;
	     public static ExtentTest extenttest; 
	     @BeforeTest
	      public void Initialize() throws Exception {
	    	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	    	   LocalDateTime now = LocalDateTime.now();  
	    	   String x = dtf.format(now);
	    	   htmlreporter = new ExtentHtmlReporter("D:\\Software\\Selenium\\Neon_work_space\\MobileAutomation\\Reports\\apkresult.html");
	    	  //htmlreporter = new ExtentHtmlReporter(config.getProperty("ExtentReport_path")+"Steriaresult"+dtf.format(now)+".html");
	    	     
	    	     htmlreporter.config().setEncoding("utf-8");
	    	     htmlreporter.config().setDocumentTitle("Automation Test");
	    	     htmlreporter.config().setReportName("Automation result");
	    	     htmlreporter.config().setTheme(Theme.STANDARD);      
	    	      extentreport = new ExtentReports();
	    	      extentreport.setSystemInfo("Organization", "way2testing");    
	    	    extentreport.attachReporter(htmlreporter);    
	    	  FileInputStream fis = new FileInputStream("D:\\Software\\Selenium\\Neon_work_space\\MobileAutomation\\src\\test\\java\\property\\config.properties");
	    	  config.load(fis);
	    	  
	    	    capabilities = new DesiredCapabilities();
	    		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, config.getProperty("DEVICE_NAME"));
	    		capabilities.setCapability(MobileCapabilityType.VERSION,  config.getProperty("VERSION"));
	    		capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
	    		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Andriod");
	    		capabilities.setCapability(MobileCapabilityType.NO_RESET, "True");
	    		
	    		capabilities.setCapability("appPackage", config.getProperty("appPackage"));
	    		capabilities.setCapability("appActivity", config.getProperty("appActivity"));
	    		File file = new File(config.getProperty("apkpath"));
	    		capabilities.setCapability("apk", file.getAbsolutePath());
	    	
	    		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	    		Thread.sleep(5000);  		
	    		
	    	
	          driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	          
	      }
	      
	      @AfterTest
	      public void close()
	      {
	    	  extentreport.flush();
	    	 // driver.quit();
	      }
	
}
