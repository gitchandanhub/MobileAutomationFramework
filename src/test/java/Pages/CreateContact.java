package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseDriver.AppDriver;

public class CreateContact extends AppDriver
{
      public CreateContact()
      {
    	  PageFactory.initElements(driver, this);
      }
      
      @FindBy(id = "com.google.android.dialer:id/contacts_tab")  WebElement contact;
      @FindBy(id = "com.google.android.dialer:id/contact_name")  WebElement newcontact;
      
      
      public void clickcontact() throws InterruptedException
      {
    	  driver.findElementById("com.google.android.dialer:id/contacts_tab").click();
    	  log.info("Contacts tab is clicked");
    	  System.out.println("Contacts tab is clicked");
    	  Thread.sleep(1000);
      }
      
      public void clickCreatenewcontact() throws InterruptedException
      {
    	  newcontact.click();
    	  log.info("new contact button is clicked");
    	  System.out.println("new contact button is clicked");
    	  Thread.sleep(1000);
      }
}
