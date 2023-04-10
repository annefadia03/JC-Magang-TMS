package com.juaracoding.tms.pages;

import com.juaracoding.tms.drivers.strategies.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import javax.xml.xpath.XPath;
import java.io.File;

public class TambahDivisiTMS {
    public JavascriptExecutor js;
    private WebDriver driver;
//    public JavascriptExecutor js = (JavascriptExecutor) driver;
    private Object Try;
    private WebElement element;
    private JavascriptExecutor executor;


    public TambahDivisiTMS() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

// General Function

    @FindBy(xpath="//center[normalize-space()='Selamat datang, Admin TMS']//i[@class='fa fa-bell fa-fw']")
    WebElement txtWelcome;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]/i[1]")
    WebElement Master;

    @FindBy(xpath = "//li[@class='has-sub expand']//li[1]")
    WebElement ExpandMenu;

    @FindBy(xpath = "///li[@class='has-sub%20expand']//li[1]")
    WebElement tambahdivisi;

    @FindBy(xpath = "//a[normalize-space()='Tambah Divisi']")
    WebElement MenuTambahDivisi;

    @FindBy(xpath = "//a[@class='btn btn-warning']")
    WebElement btnDownloadTemp;

    @FindBy(xpath = "//a[@href='https://dev.ptdika.com/tiket.com/pro/'][normalize-space()='Dashboard']")
    WebElement PathDirectory;

    //Upload Data - popUp upload data

//   WebElement btnUploadData = driver.findElement(By.xpath("/html/body/div[3]/div[4]/a[1]"));
    @FindBy(xpath = "//a[@class='btn btn-success']")
    WebElement btnUploadData;

    @FindBy(xpath = "//span[@aria-hidden='true']")
    WebElement btnXpopupUploadData;

    @FindBy(xpath = "//label[normalize-space()='Silahkan Upload :']")
    WebElement txtSilahkanUpload;

    @FindBy(xpath = "//input[@id='file']")
    WebElement btnChooseFile;

//  @FindBy(xpath = "//span[@aria-hidden='true']")
//  @FindBy(xpath ="<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">`Close`</button>")
//  WebElement btnclosepop = driver.findElement(By.xpath("//button[normalize-space()='Close']"));
//  @FindBy(css = "#modalDivisi > div > div > form > div.modal-footer > button")
//  @FindBy(xpath = "//*[@id=\"modalDivisi\"]/div/div/form/div[2]/button")
//  @FindBy(xpath = "/html[1]/body[1]/div[3]/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")
//  @FindBy(css= "\button[aria-label='Close'] > span\")")
    @FindBy(xpath = "//button[normalize-space()='Close']")

    WebElement btnClosePop;

    @FindBy(xpath = "//*[@id=\"modalDivisi\"]/div/div/form/div[2]/input")
    WebElement btnSavePop;

    @FindBy(xpath = "//div[@role='alert']")
    WebElement AlertUploadData;

    //Tabel Master Divisi

    @FindBy(xpath = "//h4[normalize-space()='Master Divisi']")
    WebElement txtMasterDivisi;

    @FindBy(xpath = "//body/div[@id='page-container']/div[@id='content']/form[1]")
    WebElement txtNamaDivisi;

    @FindBy(xpath = "//input[@id='Privilege_Name']")
    WebElement placeholdernamadivisi;

    @FindBy(xpath = "//input[@id='Privilege_Name']")
    WebElement inputnamadivisi;

    @FindBy(xpath = "//input[@value='Simpan']")
    WebElement btnSimpan;

    @FindBy(xpath = "//input[@name='update']")
    WebElement btnUpdate;

    @FindBy(xpath = "//a[@class='btn btn-block btn-danger']")
    WebElement btnCancel;

    @FindBy(xpath = "//div[@role='alert']")
    WebElement AlertUpdateBerhasil;

    //Tabel list divisi sebelah kanan

    @FindBy(xpath = "//h4[normalize-space()='List Divisi']")
    WebElement LabelListDivisi;

    @FindBy(xpath = "//div[@role='alert']")
    WebElement Alertaddnew;

    @FindBy(xpath = "//input[@type='search']")
    WebElement SearchBar;

    @FindBy(xpath = "//input[@type='search']")
    WebElement inputkeywordsearch;

    @FindBy(xpath = "//td[normalize-space()='gitu ya']")
    WebElement ResultSearch;

    @FindBy(xpath = "//select[@name='data-table-default_length']")
    WebElement EntriesDatashow;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select/option[2]")
    WebElement Entries25;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select/option[3]")
    WebElement Entries50;

    @FindBy(xpath = "//*[@id=\"data-table-default_length\"]/label/select/option[4]")
    WebElement Entries100;

    @FindBy(xpath="//div[@id='data-table-default_info']")
    WebElement Showingdata;

    //Colomn Number on list divisi table

    @FindBy(xpath = "//th[@aria-label='No: activate to sort column descending']")
    WebElement SortDescNO;

    @FindBy(xpath = "//th[@aria-label='No: activate to sort column ascending']")
    WebElement SortAscNo;

    @FindBy(xpath="//td[normalize-space()='1']")
    WebElement ResultDescNo;

    @FindBy(xpath="//td[normalize-space()='71']")
    WebElement ResultAscNo;

    //Colomn nama Divisi on list divisi table

    @FindBy(xpath = "(//input[@name='update'])[1]")
    WebElement SortDescNamaDivisi;

    @FindBy(xpath = "//th[@aria-label='Nama Divisi: activate to sort column ascending']")
    WebElement SortAscNamaDivisi;

    @FindBy(xpath = "(//strong[normalize-space()='BERHASIL!'])[1]")
    WebElement ResultDescNamaDivisi;

    @FindBy(xpath = "//td[normalize-space()='54']")
    WebElement ResultAscNamaDivisi;

    //Colomn Action on list divisi table
    @FindBy(xpath = "(//a[@class='btn btn-circle btn-warning'])[1]")
    WebElement SortDescAction;

    @FindBy(xpath = "//th[@aria-label='Action: activate to sort column ascending']")
    WebElement SortAscAction;

//  @FindBy(xpath = "//*[@id=\"data-table-default\"]/tbody/tr[1]/td[3]/a")
//  @FindBy(xpath ="/html/body/div[3]/div[4]/form/div/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr[1]/td[3]/a")
//  @FindBy(xpath = "/html[1]/body[1]/div[3]/div[4]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")
    @FindBy(xpath = "//*[@id=\"data-table-default\"]/tbody/tr[1]/td[3]/a")
    WebElement IconPensil;

//pagging Footer table List Divisi

    @FindBy(xpath = "//div[@id='data-table-default_info']")
    WebElement ShowTotalData;

    @FindBy(xpath = "//a[normalize-space()='1']")
    WebElement btnpaging1;

    @FindBy(xpath = "//a[normalize-space()='2']")
    WebElement btnpaging2;

    @FindBy(xpath = "//a[normalize-space()='3']")
    WebElement btnpaging3;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    WebElement btnPagenext;

    @FindBy(xpath = "//a[normalize-space()='Previous']")
    WebElement btnPagePrev;


// Dashboard Page

    public String getTxtDashboard(){    // Dashboard page
        return txtWelcome.getText();
    }

// Open Page tambah divisi
    public void goToMaster(){      //Side Menu Label
        Master.click();
    }

    public void clickMenu() {       //Click tambah Divisi
        ExpandMenu.click();
    }

    public String getTXTMasterDivisi() {   //text master divisi (Open Page)
        return txtMasterDivisi.getText();
    }

    public void goToDashboardDir(){         //Directory Path back to dashboard
        PathDirectory.click();
    }

// Upload Data Popup
    public void goToPopUploadData(){        //Click Button Upload data
        btnUploadData.click();
    }

    public void selectFile(){        //SelectFile
        String expectedFilePath = "/Users/sardiraymond/Downloads/Template Divisi.xlsx";
        File Uploaded = new File("/Users/sardiraymond/Downloads/Template Divisi.xlsx\"");
    }

    public void closebyXpop(){              //Close Popup X button
        btnXpopupUploadData.click();
    }

    public String getTxtSilahkanUpload(){       // text Silahkan Upload
        return txtSilahkanUpload.getText();
    }

    public void closepopbtn(){              // Close button Popup
        btnClosePop.click();
    }

    public void saveUpload(){
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", btnSavePop);
//        btnSavePop.click();

    }

    public void alertSuccsessUploadData(){   //Alert Sukses
        AlertUploadData.click();
    }


// Download

    public void clickDownloadButton(){
        btnDownloadTemp.click();
    }

    public void downloadedfile(){        //SelectFile
        String expectedFilePath = "/Users/sardiraymond/Downloads/";
        File downloaded = new File("/Users/sardiraymond/Downloads/");
    }

// Table Master divisi (sebelah kiri)

    public void clicknamadivisi(){          //Ketik nama divisi
        placeholdernamadivisi.click();
    }

    public void inputnamadivisi(String inputnamadivisi){          //input nama divisi
        this.inputnamadivisi.sendKeys(inputnamadivisi);
    }

    public void inputnamaedit(String inputnamaedit){
        this.inputnamadivisi.sendKeys(inputnamaedit);
    }


    public void simpandatadivisi(){         // Simpan data divisi
        btnSimpan.click();
    }

    public void Updatedivisi(){      // Simpan data divisi
        btnUpdate.click();
    }

    public void canceleditdivisi(){         // Simpan data divisi
        btnCancel.click();
    }

    public void berhasilsimpandatadivisi(){
        AlertUpdateBerhasil.click();
    }

// Table List  divisi (sebelah Kanan)
    public void searchbar(){                    //search Bar
        SearchBar.click();
    }

    public void inputkeywordsearch(String inputkeyword){
        this.inputkeywordsearch.sendKeys(inputkeyword);
    }

    public void foundResultSearch(){
        try {
            String attributeValue = ResultSearch.getAttribute("gitu ya");
            System.out.println("Attribute value: " + attributeValue);
        } catch (NullPointerException e) {
            System.out.println("Error: Element not found");
        }
    }

    public void EntriesDatashow(){              //Show data Entries
        EntriesDatashow.click();
    }

    public void Entriesshowdata25(){            // Dataentries 25
        Entries25.click();
    }

    public void Entriesshowdata50(){            // Dataentries 50
        Entries50.click();
    }

    public void Entriesshowdata100(){            // Dataentries 100
        Entries100.click();
    }

    public void showingdataALL(){                  //showing data
        Showingdata.click();
    }

// Table List  divisi - Colomn Number
    public void sortAsc(){
        SortAscNo.click();
    }

    public void sortDesc(){
        SortDescNO.click();
    }

    public void resultAscSortNumber(){
        try {
            String attributeValue = ResultAscNo.getAttribute("1");
            System.out.println("Attribute value: " + attributeValue);
        } catch (NullPointerException e) {
            System.out.println("Error: Element not fo1und");
        }
    }

    public void resultDesSortNumber(){
        try {
            String attributeValue = ResultDescNo.getAttribute("1");
            System.out.println("Attribute value: " + attributeValue);
        } catch (NullPointerException e) {
            System.out.println("Error: Element not fo1und");
        }
    }

// Table List  divisi - Colomn Nama Divisi
    public void sortAscNamaDivisi(){
        SortAscNamaDivisi.click();
    }

    public void SortDescNamaDivisi1(){
        SortDescNamaDivisi.click();
    }

    public void resultAscSortnamaDivisi(){
        try {
            String attributeValue = ResultAscNamaDivisi.getAttribute("1");
            System.out.println("Attribute value: " + attributeValue);
        } catch (NullPointerException e) {
            System.out.println("Error: Element not fo1und");
        }
    }

    public String resultDescSortnamaDivisi(){
        return ResultDescNamaDivisi.getText();
    }


// Table List  divisi - Colomn Action
    public void SortDescAction1(){
        SortDescAction.click();
    }

    public void SortAscAction(){
        SortAscAction.click();
    }

    public void IconPensil(){
//        executor.executeScript("arguments[IconPensil].click();", element);
        IconPensil.click();
    }

//pagging Footer table List Divisi
    public void pagging1(){
        btnpaging1.click();
    }
    public void pagging2(){
        btnpaging2.click();
    }
    public void pagging3(){
        btnpaging3.click();
    }
    public void paggingnext(){
        btnPagenext.click();
    }
    public void btnPagePrev(){
        btnPagePrev.click();
    }

//Scroll windows



}




