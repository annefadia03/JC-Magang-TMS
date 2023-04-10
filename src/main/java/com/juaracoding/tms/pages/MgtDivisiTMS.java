package com.juaracoding.tms.pages;

import com.juaracoding.tms.drivers.strategies.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class MgtDivisiTMS {
    private WebDriver driver;


    public MgtDivisiTMS() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

//Global fitur

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]/i[1]")
    WebElement Master;

    @FindBy(xpath = "//li[@class='has-sub expand']//li[1]")
    WebElement ExpandMenu;

    @FindBy(xpath = "//ul[@class='sub-menu']//a[normalize-space()='Managemen Divisi']")
    WebElement MgtDivisi;

//Page Mgt Divisi
    @FindBy(xpath ="//h4[normalize-space()='Managemen Divisi']" )
    WebElement txtMgtDivisi;

    @FindBy(xpath = "//a[@class='btn btn-success']" )
    WebElement btnUploadData;

// Upload Data Popup

    @FindBy(xpath = "//a[@class='btn btn-success']")
    WebElement dropdownPilihDivisi;

    

    @FindBy(xpath = "//div[contains(text(),'Fitur')]" )
    WebElement clickpilihdivisi;

    @FindBy(xpath = "//div[contains(text(),'Unit Layanan Informasi')]")
    WebElement ChooseUli;

    @FindBy(xpath = "//input[@id='file']")
    WebElement chooseFile;

    @FindBy(xpath = "//button[normalize-space()='Close']")
    WebElement btnClosePopup;

    @FindBy(xpath = "//input[@value='Save']")
    WebElement btnSavePopup;

    @FindBy(xpath = "//div[@role='alert']")
    WebElement AlertMgtDivSukses;

// Download button
    @FindBy(xpath = "//a[@class='btn btn-warning']")
    WebElement btnDownloadTemp;

 // Table mgtDivisi - Sebelah kiri



    @FindBy(xpath="//div[contains(text(),'-- Pilih Divisi --')]")
    WebElement DropdownNamaDivisi;

    @FindBy(xpath = "//div[contains(text(),'Nothing selected')]")
    WebElement txtnothingselected;

    @FindBy(xpath ="//div[@class='dropdown-menu show']//input[@aria-label='Search']")
    WebElement searchNamaDivisi;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//input[@aria-label='Search']")
    WebElement Inputsearchnamadivisi;

    @FindBy(xpath="//div[@aria-expanded='true']//a[@role='option']")
    WebElement Setujudivisi;

    @FindBy(xpath="//input[@id='V1_NIK']")
    WebElement txtAreaNIK;

    @FindBy(xpath="//input[@id='V1_NIK']")
    WebElement txtAreaNIKedit;

    @FindBy(xpath = "//input[@id='V1_NIK']")
    WebElement InputNIK;

    @FindBy(xpath ="//input[@id='V1_Name']" )
    WebElement txtAreaName;

    @FindBy(xpath ="//input[@value='Simpan']")
    WebElement btnSimpan;


// Table list divisi - sebelah kanan

    @FindBy(xpath = "//input[@type='search']")
    WebElement SearchBar;

    @FindBy(xpath = "//input[@type='search']")
    WebElement InputKeywordMgtsearch;

    @FindBy(xpath = "//td[normalize-space()='3']")
    WebElement ResultSearcMgtdivisi1;

    @FindBy(xpath = "//select[@name='data-table-default_length']")
    WebElement EntriesDatashow;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select/option[2]")
    WebElement Entries25;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select/option[3]")
    WebElement Entries50;

    @FindBy(xpath="//div[@id='data-table-default_info']")
    WebElement Showingdata;

    @FindBy(xpath = "//th[@aria-label='No: activate to sort column ascending']")
    WebElement colomnNoAsc;

    @FindBy(xpath ="//th[@aria-label='No: activate to sort column descending']" )
    WebElement colomnNoDesc;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[4]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[3]/button[1]")
    WebElement IconPensil;

//    @FindBy(xpath="/html[1]/body[1]/div[3]/div[4]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[3]/a[1]/i[1]")
    @FindBy(xpath="//tbody/tr[1]/td[3]/a[1]/i[1]")
    WebElement IconTrash;



    @FindBy(xpath ="//a[normalize-space()='1']")
    WebElement pagging1;

    @FindBy(xpath ="//a[normalize-space()='2']")
    WebElement pagging2;

    @FindBy(xpath ="//a[normalize-space()='2']")
    WebElement paggingNext;

//Public Void

    public String gettextalert(){
        return driver.switchTo().alert().getText();
    }
    public void accAlert(){
        driver.switchTo().alert().accept();
    }

    public void goToMaster() {          //dropdown menu
        Master.click();
    }

    public void clickMenu() {           //Dropdown klik
        ExpandMenu.click();
    }

    public void openMgtDivisi() {
        MgtDivisi.click();
    }

    public String getTxtMgtDivisi() {   //MgtDivisi page
        return txtMgtDivisi.getText();
    }

// public void - Download

    public void clickdownloadbtn(){
        btnDownloadTemp.click();
    }

    public void downloadFile(){
        String expectedFilePath = "/Users/sardiraymond/Downloads/";
        File downloaded = new File("/Users/sardiraymond/Downloads/");
    }

//Public void Upload Data

    public void goTOUploadData() {
        btnUploadData.click();
    }

    public void clickDropdown(){
        dropdownPilihDivisi.click();
    }

    public void chooseDropdown(){
        clickpilihdivisi.click();
    }

    public void selectFile(){
        String expectedFilePath = "/Users/sardiraymond/Downloads/Templates Managemen Divisi.xlsx";
        File uploaded = new File("/Users/sardiraymond/Downloads/Templates Managemen Divisi.xlsx");
    }

    public void setBtnClosePopup(){
        btnClosePopup.click();
    }

    public void savedatapopup(){
        btnSavePopup.click();
    }

    public void berhasilsimpanmgtdivisiupload(){AlertMgtDivSukses.click();}


// Table MgtDivisi - Sebelah kiri

    public void DropNamaDivisi() {
        DropdownNamaDivisi.click();
    }

    public void ChooseNamaDivisi() {
        searchNamaDivisi.click();
    }

    public void isisearchnamadivisi(){
        this.Inputsearchnamadivisi.sendKeys("Divisi1");
    }

    public void konfirmasisearchnamadivisi(){Setujudivisi.click();}

    public void AreaNIK() {
        txtAreaNIK.click();
    }

    public void isiareaNIK(){this.InputNIK.sendKeys("D6190874");}

    public void AreaName() {this.txtAreaNIKedit.getAttribute("ADITYA RIDWAN NUGRAHA");}

    public void BtnSimpan() {
        btnSimpan.click();
    }


// Table list divisi - sebelah kanan

    public void Searchbar(){
        SearchBar.click();
    }

    public void editmgtdivisi(){IconPensil.click();}

    public void cekformnamadivisi(){this.txtnothingselected.getAttribute("Nothing selected");}

    public void cekformNIKleader() {this.txtAreaNIK.getAttribute("D6190874");}

    public void inputkeywordsearchmgt(String inputkeyword){
        this.InputKeywordMgtsearch.sendKeys(inputkeyword);
    }

    public void foundsearchmgtdivisi1(){
        try {
            String attributeValue = ResultSearcMgtdivisi1.getAttribute("3");
            System.out.println("Attribute value: " + attributeValue);
        } catch (NullPointerException e) {
            System.out.println("Error: Element not found");
        }
    }

    public void ShowData() {
        EntriesDatashow.click();
    }

    public void ShowData25(){
        Entries25.click();
    }

    public void deletedata(){IconTrash.click();}

    public void ShowData50(){
        Entries50.click();

    }

    public void page1(){
        pagging1.click();
    }

    public void page2(){
        pagging2.click();
    }

    public void Next(){
        paggingNext.click();
    }

}
