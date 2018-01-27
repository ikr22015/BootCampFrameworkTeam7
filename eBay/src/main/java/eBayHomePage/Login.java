package eBayHomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
    @FindBy(css = "#gh-ug > a")
    WebElement signInlink;

    @FindBy(xpath = "//input[@name=\"userid\"]")
    WebElement usernameField;

    @FindBy(xpath = "//input[@name=\"pass\"]")
    WebElement passwordField;

    @FindBy(xpath = "//div[@id = \"btnWrapper2\"]/input[@type=\"submit\"]")
    WebElement signInButton;

    public void goToLoginAndRegiPage(){
        signInlink.click();
    }

    public void login(){
        usernameField.sendKeys("imran");
        passwordField.sendKeys("abc123");
        signInButton.click();
    }
}
