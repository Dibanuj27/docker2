package PagePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import java.util.*;


public class WindowPg1 {

	WebDriver driver;
	static String basePage;
    
    public static String url = "https://www.seleniumeasy.com/test/window-popup-modal-demo.html";
    
    @FindBy(xpath = "//a[@title='Follow @seleniumeasy on Facebook']") WebElement fb;
    @FindBy(xpath = "//*[@id=\"email\"]") WebElement email;
    @FindBy(xpath = "//*[@id=\"pass\"]") WebElement pass;
    @FindBy(xpath = "//input[@value='Log In']") WebElement login;
    @FindBy(xpath = "//a[@title='Follow @seleniumeasy on Twitter']") WebElement tw;
    
    public WindowPg1(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void clickOnFb() {
    	fb.click();
    	
    }
   
    
    public void goToFb() {
    basePage=driver.getWindowHandle();
    Set<String> s1=driver.getWindowHandles();
    Iterator<String> i1=s1.iterator();
    
    while(i1.hasNext())			
    {		
        String childPage=i1.next();		
        		
        if(!basePage.equalsIgnoreCase(childPage))			
        {    		
             driver.switchTo().window(childPage);	
             driver.manage().window().maximize();
        }		
    }		
        				
    }
    
    public void enterEmail(String emailval) {
    	email.sendKeys(emailval);
    }
    public void enterPass(String passval) {
		pass.sendKeys(passval);
	}
    public void enterLogin() {
    	login.click();
    }
    public void goToBasePage() {
    	driver.switchTo().window(basePage);
    }
    public void goToTwitter() {
		tw.click();
	}
 }
    

