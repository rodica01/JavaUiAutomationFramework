package online.tekwillacademy.pageobjects;

import online.tekwillacademy.managers.ScrollManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Page {
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
    protected WebElement logoutOption;

    public void clickOnLogoutButton(){
        ScrollManager.scrollToElement(logoutOption);
        logoutOption.click();
        System.out.println("The Logout button is clicked.");
    }
}
