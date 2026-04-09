package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
        
    }

    private final By usernameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");

    public LoginPage acess() {
        driver.get("https://www.saucedemo.com/");
        return this;
    }

    public LoginPage fillCredentials(String username, String password) {
        write(usernameInput, username);
        write(passwordInput, password);
        return this;
    }

    public void submit() {
        click(loginButton);
    }

    public boolean isAtInventoryPage() {
        return driver.getCurrentUrl().contains("/inventory.html");
    }

}
