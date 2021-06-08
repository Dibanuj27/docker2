package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PagePackage.WindowPg1;

public class WindowTst1 {
	
	public static void main(String args[]) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\proj1\\driver\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    WindowPg1 pg=new WindowPg1(driver);
    
    driver.get(WindowPg1.url);
    
    pg.clickOnFb();
    pg.goToFb();
    pg.enterEmail("1234@1234.com");
    pg.enterPass("Abcd@1234");
    pg.enterLogin();
    Thread.sleep(5000);
    driver.close();
    pg.goToBasePage();
    pg.goToTwitter();
    Thread.sleep(5000);
    driver.close();
    driver.quit();
	}
}
