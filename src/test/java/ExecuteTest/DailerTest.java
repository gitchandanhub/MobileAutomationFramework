package ExecuteTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseDriver.AppDriver;
import Pages.CreateContact;
import io.appium.java_client.android.AndroidKeyCode;
@Listeners(Listen.TestNG_Listeners.class)
public class DailerTest extends AppDriver
{
    @Test
    public void ClickContact() throws InterruptedException
    {
    	driver.findElementById("com.google.android.dialer:id/contacts_tab").click();
    	System.out.println("Contacts is clicked");
    	Thread.sleep(1000);
    	driver.findElementById("com.google.android.dialer:id/contact_name").click();
    	Thread.sleep(1000);
    	System.out.println("Create New Contacts is clicked");
    	driver.findElementByXPath(".//*[@text = 'First name']").clear();
    	driver.findElementByXPath(".//*[@text = 'First name']").sendKeys("Chandan 2");
    	System.out.println("Name Entered");
    	Thread.sleep(1000);
    	driver.pressKeyCode(AndroidKeyCode.BACK);
    	Thread.sleep(1000);
    	driver.findElementByXPath(".//*[@text = 'Phone']").clear();
    	driver.findElementByXPath(".//*[@text = 'Phone']").sendKeys("9319149865");
    	System.out.println("Number Entered");
    	Thread.sleep(1000);
    	driver.findElementByXPath(".//*[@text = 'SAVE']").click();
    	System.out.println("Save button is clicked");
    	Thread.sleep(1000);
    }
}
