package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {

    public WebDriver driver;
    @BeforeTest
    public void launchBrowser(){
        System.out.println("kjkjkjkjkjk");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\C53180A\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:www.google.co.in");
    }
}
