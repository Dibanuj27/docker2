package TestPackage;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PagePackage.PageClass;



public class TestClass {

	
	 

	
	 

	    public static void main(String[] args) throws InterruptedException {
	        // TODO Auto-generated method stub
	        
	         System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\proj1\\driver\\chromedriver.exe");
	            
	            WebDriver driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            
	            PageClass fi = new PageClass(driver);

	 

	            driver.get(PageClass.url);
	            
	            fi.enterFirstName("Dibanuj");
	            fi.enterLastName("Bhattacharya");
	            fi.enterEmail("dianuj@12345.com");
	            fi.enterPhone("9876543210");
	            fi.enterAddress("1234/MG marg");
	            fi.enterCity("Kolkata");
	            fi.enterState("California");
	            fi.enterZip("67832");
	            fi.enterWebs("https://www.facebook.com/");
	            fi.selRadio();
	            fi.enterComm("Facebook, Inc., is an American technology conglomerate based in Menlo Park, California.");
	            fi.sendSubmit();
	            
	            Thread.sleep(3000);
	            
	            driver.quit();
	           
	        
	    }

	 

	}

