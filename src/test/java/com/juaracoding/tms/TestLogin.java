package com.juaracoding.tms;

import com.juaracoding.tms.pages.LoginPageTMS;
import com.juaracoding.tms.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static LoginPageTMS loginPageTMS = new LoginPageTMS();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin open browser and url")
    public void admin_open_browser_and_url() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User open browser and url");
    }

    @When("Admin enter valid username")
    public void admin_enter_valid_username() {
        loginPageTMS.enterUsername("admin_tms");
        extentTest.log(LogStatus.PASS, "User enter valid username");
    }

    @And("Admin enter valid password")
    public void admin_enter_valid_password() {
        loginPageTMS.enterPassword("d1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "User enter valid password");
    }

    @And("Admin click button login")
    public void admin_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }

    @Then("Admin go to page Dashboard")
    public void admin_go_to_page_Dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(loginPageTMS.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "User go to page Dashboard");
    }

    @When("User click button logout")
    public void user_click_button_logout() {
        loginPageTMS.setButtonLogout();
        System.out.println("User click button logout\n");
    }

    @And("User enter invalid username")
    public void user_enter_invalid_username() {
        Hooks.delay(3);
        System.out.println("User input invalid username");
        loginPageTMS.enterUsername("admin_tms");
    }

    @And("User enter invalid password")
    public void user_enter_invalid_password() {
        Hooks.delay(3);
        System.out.println("User input invalid password");
        loginPageTMS.enterPassword("d1k4@passw0rddd");
    }
    @Then("User get message invalid credential")
    public void user_get_message_invalid_credential() {
        Assert.assertEquals(loginPageTMS.getInvalidCredentials(),"×\n" +
                "Wrong username or password..!");
        extentTest.log(LogStatus.PASS, "User get message invalid credential\n");
        System.out.println(loginPageTMS.getInvalidCredentials());
        Hooks.delay(3);
    }
}