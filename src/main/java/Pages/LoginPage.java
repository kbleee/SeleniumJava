package Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    @Test
    public void loginTest(){
        System.out.println("Test"+driver.getCurrentUrl().toString());
    }


}
