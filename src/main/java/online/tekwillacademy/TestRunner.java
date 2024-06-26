package online.tekwillacademy;


import online.tekwillacademy.managers.DataGeneratorManager;
import online.tekwillacademy.managers.DriverManager;

import online.tekwillacademy.pageobjects.AccountPage;
import online.tekwillacademy.pageobjects.HomePage;
import online.tekwillacademy.pageobjects.LoginPage;
import online.tekwillacademy.pageobjects.RegisterPage;
import org.openqa.selenium.*;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverManager.getInstance().getDriver();
        driver.get("https://tekwillacademy-opencart.online/");

        HomePage homePage = new HomePage(driver);
        homePage.navigateToRegisterPage();

        RegisterPage registerPage = new RegisterPage(driver);
        String randomEmail = DataGeneratorManager.getRandomEmail();
        registerPage.completeTheRegisterForm("Rodica","Popa", DataGeneratorManager.getRandomEmail(),"Password123");
        registerPage.enablePrivacyToggle();
        registerPage.clickOnContinueButton();
        Thread.sleep(2000);

        AccountPage accountPage = new AccountPage(driver);
        accountPage.clickOnLogoutButton();

        homePage.navigateToLoginButton();
        Thread.sleep(3000);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.completeTheLoginForm(randomEmail, "Password123");
        loginPage.clickOnContinueButton();

        Thread.sleep(5000);

        driver.quit();
        System.out.println("The test is finished and the driver is closed.");
    }
}