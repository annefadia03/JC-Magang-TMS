package com.juaracoding.tms;

import com.juaracoding.tms.pages.LoginPageTMS;
import com.juaracoding.tms.pages.MgtDivisiTMS;
import com.juaracoding.tms.pages.TambahDivisiTMS;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.sql.Driver;

public class MgtDivisi {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static MgtDivisiTMS MgtDivisiTMS = new MgtDivisiTMS();
    private JavascriptExecutor js;


    public MgtDivisi() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

// BUKA HALAMAN MANAGEMENT DIVISI :

    @Given("berada pada page login")
    public void berada_pada_page_login() {
        extentTest.log(LogStatus.PASS, "User go to page Dashboard");
    }

    @When("klik Master")
    public void klik_master() {
        Hooks.delay(1);
        MgtDivisiTMS.goToMaster();
        extentTest.log(LogStatus.PASS, "User on click master");
    }

    @And("Klik Menu Mgt Divisi")
    public void Klik_Menu_Mgt_Divisi() {
        Hooks.delay(1);
        MgtDivisiTMS.openMgtDivisi();
        extentTest.log(LogStatus.PASS, "User on Click Managemen Divisi");
    }

    @Then("on Page MGT Divisi")
    public void on_Page_MGT_Divisi() {
        Assert.assertEquals(MgtDivisiTMS.getTxtMgtDivisi(), "");
        extentTest.log(LogStatus.PASS, "User go to page Managemen Divisi");
    }

    //  FUNCTION DOWNLOAD MANAGEMENT DIVISI & TEMPLATE

    @When("klik download")
    public void klik_download() {
        Hooks.delay(1);
        MgtDivisiTMS.clickdownloadbtn();
        extentTest.log(LogStatus.PASS, "Klik Button Download MGT Divisi");
    }

    @Then("downloaded template")
    public void downloaded_template() {
        Hooks.delay(1);
        MgtDivisiTMS.downloadFile();
        extentTest.log(LogStatus.PASS, "Template downloaded");
    }

//SHOW DATA DROPDOWN ENTRIES

    @When("klik list entries dropdown")
    public void klik_list_entries_dropdown() {
        Hooks.delay(1);
        MgtDivisiTMS.ShowData();
        extentTest.log(LogStatus.PASS, "Show Entries 10");

    }

    @And("Pilih 25 Entries")
    public void pilih_25_Entries(){
        Hooks.delay(1);
        MgtDivisiTMS.ShowData25();
        extentTest.log(LogStatus.PASS, "Show Entries 25");
    }

// FUNCTION SEARCH BAR

    @When("klik field search bar")
    public void klik_field_search_bar(){
        Hooks.delay(1);
        MgtDivisiTMS.Searchbar();
        extentTest.log(LogStatus.PASS, "Click Searchbar");
    }

    @And("input keyword search")
    public void input_keyword_search(){
        Hooks.delay(1);
        MgtDivisiTMS.inputkeywordsearchmgt("DIVISI1");
        extentTest.log(LogStatus.PASS, "keyword Search Divisi1");
    }

    @Then("hasil pencarian")
    public void hasil_pencarian(){
        MgtDivisiTMS.foundsearchmgtdivisi1();
        extentTest.log(LogStatus.PASS, "sukses search Divisi1");
        driver.navigate().refresh();
    }

 // EDIT MANAGEMENT DIVISI
    @When("klik icon pensil data")
    public void klik_icon_pensil_data(){
        MgtDivisiTMS.editmgtdivisi();
        extentTest.log(LogStatus.PASS, "icon pensil");
    }

    @And("cek form nama divisi")
    public void cek_form_nama_divisi(){
        Hooks.delay(1);
        MgtDivisiTMS.cekformnamadivisi();
        extentTest.log(LogStatus.PASS, "auto nothing select");
    }

    @And("Cek NIK team leader")
    public void Cek_NIK_team_leader(){
        Hooks.delay(1);
        MgtDivisiTMS.cekformNIKleader();
        extentTest.log(LogStatus.PASS, "D6190874");
    }

    @And("Auto nama team leader")
    public void Auto_nama_team_leader (){
        Hooks.delay(1);
        MgtDivisiTMS.AreaName();
        extentTest.log(LogStatus.PASS, "ADITYA RIDWAN NUGRAHA");
    }

    @Then("Simpan")
    public void Simpan (){
        Hooks.delay(1);
        MgtDivisiTMS.BtnSimpan();
        extentTest.log(LogStatus.PASS, "Klik simpan");
    }

// DELETE DATA
    @When ("klik icon Trash")
    public void klik_icon_trash(){
        Hooks.delay(1);
        MgtDivisiTMS.deletedata();
        extentTest.log(LogStatus.PASS, "Delete Data");
    }

    @Then ("Alert popup")
    public void Alert_popup(){
        Hooks.delay(1);
        MgtDivisiTMS.deletedata();
        Assert.assertEquals(MgtDivisiTMS.gettextalert(),"Are You Sure?");
        extentTest.log(LogStatus.PASS, "Are You Sure?");
    }


// TAMBAH MANAGEMENT DIVISI

    @When("klik nama divisi area")
    public void klik_nama_divisi_area() {
        Hooks.delay(1);
        MgtDivisiTMS.DropNamaDivisi();
        extentTest.log(LogStatus.PASS, "Klik nama divisi");
    }

    @And("Pilih Divisi")
    public void Pilih_Divisi() {
        Hooks.delay(1);
        MgtDivisiTMS.ChooseNamaDivisi();
        extentTest.log(LogStatus.PASS, "pilih dari dropdown");
    }

    @And("Ketik nama divisi")
    public void ketik_nama_divisi() {
        Hooks.delay(1);
        MgtDivisiTMS.isisearchnamadivisi();
        extentTest.log(LogStatus.PASS, "ketik divisi 1");
    }

    @And("Setuju pilihan")
    public void Setuju_pilihan() {
        Hooks.delay(1);
        MgtDivisiTMS.konfirmasisearchnamadivisi();
        extentTest.log(LogStatus.PASS, "Memilih divisi 1");
    }

    @And("Masukan NIK Team leader")
    public void Masukan_NIK_Team_leader() {
        Hooks.delay(1);
        MgtDivisiTMS.AreaNIK();
        MgtDivisiTMS.isiareaNIK();
        extentTest.log(LogStatus.PASS, "Click dan Isi NIK");
    }

    @And("Autofill nama team leader")
    public void Autofill_nama_team_leader() {
        Hooks.delay(1);
        MgtDivisiTMS.AreaName();
        extentTest.log(LogStatus.PASS, "autofill nama team leader");
    }

    @Then("Simpan data Tambah MGT Divisi")
    public void Simpan_data_Tambah_MGT_Divisi() {
        Hooks.delay(1);
        MgtDivisiTMS.BtnSimpan();
        Assert.assertEquals(MgtDivisiTMS.gettextalert(),"Data Berhasil Disimpan!");
        extentTest.log(LogStatus.PASS, "Simpan data baru");
        driver.navigate().refresh();
    }


// FUNCTION UPLOAD DATA

    @Given("Klik Button Upload")
    public void Klik_Button_Upload() {
        Hooks.delay(1);
        MgtDivisiTMS.goTOUploadData();
        extentTest.log(LogStatus.PASS, "Klik button upload data");
    }

    @And("dropdown pilih divisi")
    public void dropdown_pilih_divisi() {
        Hooks.delay(1);
        MgtDivisiTMS.clickDropdown();
        extentTest.log(LogStatus.PASS, "dropdown pilih divisi");
    }

    @And("choosefile")
    public void choosefile() {
        Hooks.delay(1);
        MgtDivisiTMS.chooseDropdown();
        extentTest.log(LogStatus.PASS, "choose file upload");
    }

    @And("Save upload data")
    public void choose_file_upload(){
        Hooks.delay(1);
        MgtDivisiTMS.selectFile();
        extentTest.log(LogStatus.PASS, "Save upload data");
    }

    @Then("Alert Berhasil")
    public void Alert_Berhasil(){
        Hooks.delay(1);
        MgtDivisiTMS.selectFile();
        extentTest.log(LogStatus.PASS, "Alert");
    }
}
