package PagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PgClssDown {
	
	WebDriverWait wait;
	WebDriver driver;
    
    public static String url = "https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html";
    
    
    @FindBy(xpath="//button[@id='downloadButton']") WebElement buttn;    
    
    //@FindBy(xpath = "//button[normalize-space()='Close']") WebElement close;
    By close=By.xpath("//button[normalize-space()='Close']");			
    
    public PgClssDown(WebDriver driver) {
    	wait=new WebDriverWait(driver, 10);
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    	}
    
    
    
    
    
    public void selectStartButton() throws InterruptedException {
		buttn.click();
		//Thread.sleep(5000);
	}
    
    public void selectCloseButton() {
    	//WebDriverWait wait=new WebDriverWait(driver, 10);
    	//PageFactory.initElements(driver, this);
        wait.until(ExpectedConditions.elementToBeClickable(close)).click();
    	
    }
}
