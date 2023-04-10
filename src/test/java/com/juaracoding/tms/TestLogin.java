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
        extentTest.log(LogStatus.PASS, "Admin open browser and url");
    }

    @When("Admin enter valid username")
    public void admin_enter_valid_username() {
        loginPageTMS.enterUsername("admin_tms");
        extentTest.log(LogStatus.PASS, "Admin enter valid username");
    }

    @And("Admin enter valid password")
    public void admin_enter_valid_password() {
        loginPageTMS.enterPassword("d1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "Admin enter valid password");
    }

    @And("Admin click button login")
    public void admin_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "Admin click button login");
    }

    @Then("Admin go to page Dashboard")
    public void admin_go_to_page_Dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(loginPageTMS.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "Admin go to page Dashboard");
    }

    @When("Admin click button logout")
    public void admin_click_button_logout() {
        loginPageTMS.setButtonLogout();
        System.out.println("Admin click button logout\n");
    }

    @And("Admin enter invalid username")
    public void admin_enter_invalid_username() {
        Hooks.delay(3);
        System.out.println("Admin enter invalid username");
        loginPageTMS.enterUsername("admin_tms");
    }

    @And("Admin enter invalid password")
    public void admin_enter_invalid_password() {
        Hooks.delay(3);
        System.out.println("Admin enter invalid password");
        loginPageTMS.enterPassword("d1k4@passw0rddd");
    }
    @And("User Admin click button login")
    public void user_admin_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User Admin click button login");
    }

    @Then("Admin get message invalid credential")
    public void admin_get_message_invalid_credential() {
        Assert.assertEquals(loginPageTMS.getInvalidCredentials(), "×\n" +
                "Wrong username or password..!");
        Assert.assertTrue(loginPageTMS.getInvalidCredentials().contains("Wrong username or password..!"));
        extentTest.log(LogStatus.PASS, "Admin get message invalid credential");
        System.out.println(loginPageTMS.getInvalidCredentials());
        Hooks.delay(1);
    }

    //staff1
    @And("User staff1 enter valid username")
    public void user_staff1_enter_valid_username() {
        loginPageTMS.enterUsername("D6190874");
        extentTest.log(LogStatus.PASS, "User staff1 enter valid username");
    }

    @And("User staff1 enter valid password")
    public void User_staff1_enter_valid_password() {
        loginPageTMS.enterPassword("2001-01-08");
        extentTest.log(LogStatus.PASS, "User staff1 enter valid password");
    }

    @And("User staff1 click button login")
    public void User_staff1_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User staff1 click button login");
    }

    @Then("User staff1 go to page Dashboard")
    public void user_staff1_go_to_page_Dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(loginPageTMS.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "user staff1 go to page Dashboard");
    }

    //staff2
    @When("User staff1 click button logout")
    public void user_staff1_click_button_logout() {
        loginPageTMS.setButtonLogout();
        System.out.println("user staff1 click button logout\n");
    }
    @And("User staff2 enter valid username")
    public void user_staff2_enter_valid_username() {
        loginPageTMS.enterUsername("D6220404");
        extentTest.log(LogStatus.PASS, "User staff2 enter valid username");
    }
    @And("User staff2 enter valid password")
    public void User_staff2_enter_valid_password() {
        loginPageTMS.enterPassword("1996-09-29");
        extentTest.log(LogStatus.PASS, "User staff2 enter valid password");
    }

    @And("User staff2 click button login")
    public void User_staff2_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User staff2 click button login");
    }

    @Then("User staff2 go to page Dashboard")
    public void user_staff2_go_to_page_Dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(loginPageTMS.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "user staff2 go to page Dashboard");
    }

    //staff3
    @When("User staff2 click button logout")
    public void user_staff2_click_button_logout() {
        loginPageTMS.setButtonLogout();
        System.out.println("user staff2 click button logout\n");
    }
    @And("User staff3 enter valid username")
    public void user_staff3_enter_valid_username() {
        loginPageTMS.enterUsername("D6210598");
        extentTest.log(LogStatus.PASS, "User staff3 enter valid username");
    }

    @And("User staff3 enter valid password")
    public void User_staff3_enter_valid_password() {
        loginPageTMS.enterPassword("1999-04-01");
        extentTest.log(LogStatus.PASS, "User staff3 enter valid password");
    }

    @And("User staff3 click button login")
    public void User_staff3_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User staff3 click button login");
    }

    @Then("User staff3 go to page Dashboard")
    public void user_staff3_go_to_page_Dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(loginPageTMS.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "user staff3 go to page Dashboard");
    }

    //staff4
    @When("User staff3 click button logout")
    public void user_staff3_click_button_logout() {
        loginPageTMS.setButtonLogout();
        System.out.println("user staff3 click button logout\n");
    }
    @And("User staff4 enter valid username")
    public void user_staff4_enter_valid_username() {
        loginPageTMS.enterUsername("D6210601");
        extentTest.log(LogStatus.PASS, "User staff4 enter valid username");
    }

    @And("User staff4 enter valid password")
    public void User_staff4_enter_valid_password() {
        loginPageTMS.enterPassword("1995-03-29");
        extentTest.log(LogStatus.PASS, "User staff4 enter valid password");
    }

    @And("User staff4 click button login")
    public void User_staff4_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User staff4 click button login");
    }

    @Then("User staff4 go to page Dashboard")
    public void user_staff4_go_to_page_Dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(loginPageTMS.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "user staff4 go to page Dashboard");
    }

    //staff5
    @When("User staff4 click button logout")
    public void user_staff4_click_button_logout() {
        loginPageTMS.setButtonLogout();
        System.out.println("user staff4 click button logout\n");
    }

    //staff valid login
    @And("User staff5 enter valid username")
    public void user_staff5_enter_valid_username() {
        loginPageTMS.enterUsername("D6220258");
        extentTest.log(LogStatus.PASS, "User staff5 enter valid username");
    }

    @And("User staff5 enter valid password")
    public void User_staff5_enter_valid_password() {
        loginPageTMS.enterPassword("1993-11-12");
        extentTest.log(LogStatus.PASS, "User staff5 enter valid password");
    }

    @And("User staff5 click button login")
    public void User_staff5_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User staff5 click button login");
    }

    @Then("User staff5 go to page Dashboard")
    public void user_staff5_go_to_page_Dashboard() {
        Hooks.delay(1);
        Assert.assertEquals(loginPageTMS.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "user staff5 go to page Dashboard");
    }

    //staff input Password null
    @When("User staff5 click button logout")
    public void user_staff5_click_button_logout() {
        loginPageTMS.setButtonLogout();
        System.out.println("user staff4 click button logout\n");
    }
    @And("User enter valid username")
    public void user_enter_valid_username() {
        loginPageTMS.enterUsername("D6220637");
        extentTest.log(LogStatus.PASS, "User enter valid username");
    }

    @And("User enter null password")
    public void User_enter_null_password() {
        loginPageTMS.PasswordNul();
        extentTest.log(LogStatus.PASS, "User enter null password");
    }
    @And("User click button login")
    public void User_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User staff1 click button login");
    }
    @Then("User get message invalid null")
    public void user_get_message_invalid_null() {
        Assert.assertEquals(loginPageTMS.PasswordNul(),"true" );
        Assert.assertTrue(loginPageTMS.PasswordNul().contains("true"));
        extentTest.log(LogStatus.PASS, "Admin get message invalid credential");
        System.out.println(loginPageTMS.PasswordNul());
        Hooks.delay(1);
    }

    //staff input nul username
    @And("User enter null username")
    public void user_enter_null_username() {
        loginPageTMS.UsernameNull();
        extentTest.log(LogStatus.PASS, "User enter null username");
    }

    @And("User staff enter password")
    public void User_staff_enter_password() {
        loginPageTMS.enterPassword("D6220637");
        extentTest.log(LogStatus.PASS, "User staff enter valid password");
    }
    @And("Staff click button login")
    public void Staff_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "Staff click button login");
    }
    @Then("User get message invalid login")
    public void user_get_message_invalid_login() {
        Assert.assertEquals(loginPageTMS.UsernameNull(),"true" );
        Assert.assertTrue(loginPageTMS.UsernameNull().contains("true"));
        extentTest.log(LogStatus.PASS, "Admin get message invalid credential");
        System.out.println(loginPageTMS.UsernameNull());
        Hooks.delay(1);
    }

    //staff input nul username and null password
    @And("Staff enter null username")
    public void staff_enter_null_username() {
        loginPageTMS.UsernameNull();
        extentTest.log(LogStatus.PASS, "staff enter null username");
    }

    @And("Staff enter null password")
    public void Staff_enter_null_password() {
        loginPageTMS.PasswordNul();
        extentTest.log(LogStatus.PASS, "Staff enter null valid password");
    }
    @And("User Staff click button login")
    public void user_staff_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User Staff click button login");
    }
    @Then("User Staff get message invalid login")
    public void user_staff_get_message_invalid_login() {
        Assert.assertEquals(loginPageTMS.UsernameNull(),"true" );
        Assert.assertTrue(loginPageTMS.UsernameNull().contains("true"));
        extentTest.log(LogStatus.PASS, "user staff get message invalid credential");
        System.out.println(loginPageTMS.UsernameNull());
        Hooks.delay(1);
    }

    //admin invalid password
    @And("Admin1 enter valid username")
    public void admin1_enter_valid_username() {
        Hooks.delay(3);
        System.out.println("Admin1 enter valid username");
        loginPageTMS.enterUsername("admin_tms");
    }

    @And("Admin1 enter invalid password")
    public void admin1_enter_invalid_password() {
        Hooks.delay(3);
        System.out.println("Admin enter invalid password");
        loginPageTMS.enterPassword("d1k4@passw0rddda");
    }
    @And("User Admin1 click button login")
    public void user_admin1_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User Admin1 click button login");
    }

    @Then("Admin1 get message invalid credential")
    public void admin1_get_message_invalid_credential() {
        Assert.assertEquals(loginPageTMS.getInvalidCredentials(), "×\n" +
                "Wrong username or password..!");
        Assert.assertTrue(loginPageTMS.getInvalidCredentials().contains("Wrong username or password..!"));
        extentTest.log(LogStatus.PASS, "Admin1 get message invalid credential");
        System.out.println(loginPageTMS.getInvalidCredentials());
        Hooks.delay(1);
    }

    //admin invalid pasword dan invalid usename
    @And("Admin2 enter invalid username")
    public void admin2_enter_invalid_username() {
        Hooks.delay(3);
        System.out.println("Admin2 enter invalid username");
        loginPageTMS.enterUsername("admin_tms2");
    }

    @And("Admin2 enter invalid password")
    public void admin2_enter_invalid_password() {
        Hooks.delay(3);
        System.out.println("Admin enter invalid password");
        loginPageTMS.enterPassword("d1k4@passw0rddd2");
    }
    @And("User Admin2 click button login")
    public void user_admin2_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User Admin2 click button login");
    }

    @Then("Admin2 get message invalid credential")
    public void admin2_get_message_invalid_credential() {
        Assert.assertEquals(loginPageTMS.getInvalidCredentials(), "×\n" +
                "Wrong username or password..!");
        Assert.assertTrue(loginPageTMS.getInvalidCredentials().contains("Wrong username or password..!"));
        extentTest.log(LogStatus.PASS, "Admin get message invalid credential");
        System.out.println(loginPageTMS.getInvalidCredentials());
        Hooks.delay(1);
    }

    // admin login null password
    @And("Admin3 enter username")
    public void admin3_enter_username() {
        Hooks.delay(3);
        System.out.println("Admin3 enter username");
        loginPageTMS.enterUsername("admin_tms");
    }

    @And("Admin3 enter null password")
    public void admin3_enter_null_password() {
        Hooks.delay(3);
        System.out.println("Admin3 enter null password");
        loginPageTMS.NullPasswordAdmin();
    }
    @And("User Admin3 click button login")
    public void user_admin3_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User Admin3 click button login");
    }
    @Then("User Admin3 get message invalid login")
    public void user_admin3_get_message_invalid_login() {
        Assert.assertEquals(loginPageTMS.NullPasswordAdmin(),"true" );
        Assert.assertTrue(loginPageTMS.NullPasswordAdmin().contains("true"));
        extentTest.log(LogStatus.PASS, "user admin3 get message invalid credential");
        System.out.println(loginPageTMS.NullPasswordAdmin());
        Hooks.delay(1);
    }

    //admin null username
    @And("Admin4 enter null username")
    public void admin4_enter_null_username() {
        Hooks.delay(3);
        System.out.println("Admin4 enter null username");
        loginPageTMS.NullUsernameAdmin();
    }

    @And("Admin4 enter password")
    public void admin4_enter_password() {
        Hooks.delay(3);
        System.out.println("Admin4 enter password");
        loginPageTMS.PasswordNul();
    }
    @And("User Admin4 click button login")
    public void user_admin4_click_button_login() {
        loginPageTMS.buttonLogin();
        extentTest.log(LogStatus.PASS, "User Admin4 click button login");
    }
    @Then("User Admin4 get message invalid login")
    public void user_admin4_get_message_invalid_login() {
        Assert.assertEquals(loginPageTMS.NullUsernameAdmin(),"true" );
        Assert.assertTrue(loginPageTMS.NullUsernameAdmin().contains("true"));
        extentTest.log(LogStatus.PASS, "user admin3 get message invalid credential");
        System.out.println(loginPageTMS.NullUsernameAdmin());
        Hooks.delay(1);
    }









}
