package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageClass {

		WebDriver driver;
	    
	    public static String url = "https://www.seleniumeasy.com/test/input-form-demo.html";
	    
	    @FindBy(xpath="//input[@data-bv-field='first_name']") WebElement firstName;

	    @FindBy(name="last_name") WebElement lastName;    

	    @FindBy(name="email") WebElement email;

	    @FindBy(name="phone") WebElement phoneNum;
	    
	    @FindBy(xpath="//input[@data-bv-field='address']") WebElement address;    
	    
	    @FindBy(name="city") WebElement city;

	    @FindBy(name = "state") WebElement state;
	    
	    @FindBy(xpath = "//input[@name='zip']") WebElement zip;
	 
	    @FindBy(xpath = "//input[@name='website']") WebElement webs;
	    
	    @FindBy(xpath = "//input[@type='radio']") WebElement rad;
	    
	    @FindBy(xpath = "//textarea[@name='comment']") WebElement cmnt;
	    
	    @FindBy(xpath = "//button[@class='btn btn-default']") WebElement send;

	    public PageClass(WebDriver driver){

	    	this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    public void enterFirstName(String firstNameValue) {
	        firstName.sendKeys(firstNameValue);
	    }
	    
	    public void enterLastName(String lastNameValue) {
	        lastName.sendKeys(lastNameValue);
	    }

	    public void enterEmail(String emailValue) {
	        email.sendKeys(emailValue);
	    }

	    public void enterAddress(String addressValue) {
	        address.sendKeys(addressValue);
	    }
	    
	    public void enterPhone(String phoneValue) {
	        phoneNum.sendKeys(phoneValue);
	    }
	    
	    public void enterCity(String cityValue) {
	        city.sendKeys(cityValue);
	    }
	    
	    public void enterState(String stateValue) {
			Select s1=new Select(state);
			s1.selectByVisibleText(stateValue);
		}
	    
	    public void enterZip(String zipValue) {
	        zip.sendKeys(zipValue);
	    }
	    
	    public void enterWebs(String websValue) {
	        webs.sendKeys(websValue);
	    }

	    public void selRadio() {
	    	rad.click();
	    }

	    public void enterComm(String commValue) {
	        cmnt.sendKeys(commValue);
	    }
	    
	    public void sendSubmit() {
	    	send.click();
	    }

	    
	}

