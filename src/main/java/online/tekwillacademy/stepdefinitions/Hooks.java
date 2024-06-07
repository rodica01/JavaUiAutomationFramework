package online.tekwillacademy.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import online.tekwillacademy.managers.DriverManager;

public class Hooks {

    @BeforeAll
    public static void beforeAllTheTestsAreExecuted(){
        System.out.println("The test engine started - this method is executed once!");
    }

    @Before
    public void beforeEachTestScenario(){
        System.out.println("The test has been started!");
    }

    @After
    public void afterEachTestScenario(){
        DriverManager.getInstance().quitDriver();
    }

    @AfterAll
    public static void executeAfterAllTheTests(){
        System.out.println("The test execution is finished!");
    }
}
