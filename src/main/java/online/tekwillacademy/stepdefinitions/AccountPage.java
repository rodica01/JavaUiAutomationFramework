package online.tekwillacademy.stepdefinitions;

import io.cucumber.java.en.Then;
import online.tekwillacademy.managers.DriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AccountPage {

    WebDriver driver = DriverManager.getInstance().getDriver();

    @Then("The page URL contains the {string} keyword")
    public void thePageURLContainsTheKeyword(String collectedStringValue) throws InterruptedException {
        Thread.sleep(1000);
        boolean theUrlContainsTheCollectedKeywordFromTheStep = driver.getCurrentUrl().contains(collectedStringValue);
        System.out.println(driver.getCurrentUrl());
        Assertions.assertTrue(theUrlContainsTheCollectedKeywordFromTheStep, "The URl contains teh wanted keyword!");

    }
}
