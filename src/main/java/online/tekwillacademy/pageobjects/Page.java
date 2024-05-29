package online.tekwillacademy.pageobjects;

import online.tekwillacademy.managers.ScrollManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {

    public Page (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//i[@class='fa-solid fa-user']")
    protected WebElement userDropDownIcon;

    @FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Register']")
    protected WebElement registerOption;

    @FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Login']")
    protected WebElement loginOption;

    public void navigateToRegisterPage(){
        userDropDownIcon.click();
        registerOption.click();
        System.out.println("The Register option has been selected from Header");
    }
    public void navigateToLoginButton(){
        userDropDownIcon.click();
        loginOption.click();
        System.out.println("The Login option has been clicked");
    }
}

