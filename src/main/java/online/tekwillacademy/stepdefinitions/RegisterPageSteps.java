package online.tekwillacademy.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import online.tekwillacademy.managers.DataGeneratorManager;
import online.tekwillacademy.managers.DriverManager;
import online.tekwillacademy.pageobjects.RegisterPage;
import org.openqa.selenium.WebDriver;

public class RegisterPageSteps {

    WebDriver driver = DriverManager.getInstance().getDriver();
    RegisterPage registerPage = new RegisterPage(driver);


    @And("The register form is populated with valid data")
    public void theRegisterFormIsPopulatedWithValidData() {

        String firstname = DataGeneratorManager.getRandomName();
        String lastname = DataGeneratorManager.getRandomName();
        String email = DataGeneratorManager.getRandomEmail();
        String password = DataGeneratorManager.getRandomPassword(10, 20);

        registerPage.completeTheRegisterForm(firstname, lastname, email, password);
    }

    @And("Privacy Toggle is enabled")
    public void privacyToggleIsEnabled() {
        registerPage.enablePrivacyToggle();
    }

    @When("The continue Button is clicked")
    public void theContinueButtonIsClicked() {
        registerPage.clickOnContinueButton();
    }
}
