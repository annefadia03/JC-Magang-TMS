package com.juaracoding.tms.pages;

import com.juaracoding.tms.drivers.strategies.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTMS {
    private WebDriver driver;
    public LoginPageTMS(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@placeholder='NIK'])[1]")
    WebElement username;

    @FindBy(xpath = "(//input[@placeholder='Password'])[1]")
    WebElement password;

    @FindBy(xpath = "(//button[normalize-space()='Login'])[1]")
    WebElement btnLogin;

    @FindBy(xpath = "//a[@class='dropdown-toggle']//b[@class='caret']")
    WebElement btnProfile;
    @FindBy(xpath = "//a[normalize-space()='Log Out']")
    WebElement btnLogout;
    @FindBy(xpath = "//*[@id=\"page-container\"]/div/div[1]")
    WebElement txtInvalidLogin;

    @FindBy(xpath = "//*[@id=\"page-wrapper\"]/div/div[1]/div/h1")
    WebElement txtDashboard;

    public void enterUsername(String username){
        this.username.sendKeys(username);
    }

    public void enterPassword(String password){
        this.password.sendKeys(password);
    }

    public void buttonLogin(){
        btnLogin.click();
    }

    public String getInvalidCredentials(){
        return txtInvalidLogin.getText();
    }

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
    public void setButtonLogout(){
        btnProfile.click();
        btnLogout.click();
    }

}
