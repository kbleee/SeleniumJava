package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class BaseClass {

    public WebDriver driver;
    
    @BeforeTest
    public void launchBrowser(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\C53180A\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
        
    }
}
