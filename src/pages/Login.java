package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    private WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getEmailInput() {
        return driver.findElement(By.id("login-email"));
    }
    private WebElement getPasswordInput() {
        return driver.findElement(By.id("login-senha"));
    }

    private WebElement getLoginButton() {
        return driver.findElement(By.id("login-acessar"));
    }

    public void setEmail(String email) {
        getEmailInput().sendKeys(email);
    }

    public void setSenha(String senha) {
        getPasswordInput().sendKeys(senha);
    }

    public void clickButton() {
        getLoginButton().click();
    }

    public void logar(String email, String senha) {
        setEmail(email);
        setSenha(senha);
        clickButton();
    }
}