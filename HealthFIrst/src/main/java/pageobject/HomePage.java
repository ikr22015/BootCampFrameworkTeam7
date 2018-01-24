package pageobject;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI{
    @FindBy(css = "input.display.search_box_upd")
    WebElement searchBox;

    @FindBy(xpath = "//input[@name = 'sa']")
    WebElement goBtn;



    public void search(){
        searchBox.sendKeys("doctor");
        goBtn.click();
    }
}
