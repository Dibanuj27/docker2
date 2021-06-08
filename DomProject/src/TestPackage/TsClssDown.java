package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PagePackage.PgClssDown;



public class TsClssDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\proj1\\driver\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get(PgClssDown.url);
        PgClssDown pd = new PgClssDown(driver);
        
        
        pd.selectStartButton();
        pd.selectCloseButton();
        
        Thread.sleep(3000);
        driver.quit();

	}

}
