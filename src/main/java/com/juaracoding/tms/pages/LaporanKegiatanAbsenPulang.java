package com.juaracoding.tms.pages;

import com.Juaracoding.tms.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaporanKegiatanAbsenPulang {
    WebDriver driver;

    public LaporanKegiatanAbsenPulang(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Absen Pulang")
    WebElement btnAbsenPulang;

    public void setBtnAbsenPulang(){
        btnAbsenPulang.click();
    }
}
