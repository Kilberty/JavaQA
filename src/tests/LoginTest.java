package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;

public class LoginTest {
    private WebDriver driver;
    private Login login;

    public LoginTest(WebDriver driver) {
    	this.driver = driver;
    	this.login = new Login(driver);
    }
    
    public void acessarLogin() {
        driver.get("https://stage-release-2.softcomshop.com.br/auth/login");
        this.login = new Login(driver);
    }

    public void testaLogin() {
        login.logar("fabrica@softcomtecnologia.com.br", "fab1478");
    }

    public void fechar() {
        if (driver != null) {
            driver.quit();
        }
    }
}