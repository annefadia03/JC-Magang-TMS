package com.juaracoding.tms;

import com.juaracoding.tms.pages.LoginPageTMS;
import com.juaracoding.tms.pages.TambahDivisiTMS;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.sql.Driver;

public class TambahDivisiModul {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static LoginPageTMS loginPage = new LoginPageTMS();
    public static TambahDivisiTMS tambahDivisiTMS = new TambahDivisiTMS();

    public TambahDivisiModul(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

// BUKA HALAMAN TAMBAH DIVISI

    @Given("admin Already Logged in")
    public void admin_already_logged_in() {
        extentTest.log(LogStatus.PASS,"User go to page Dashboard");
    }

    @When("admin click Master")
    public void admin_click_master(){
        tambahDivisiTMS.goToMaster();
        extentTest.log(LogStatus.PASS,"User on click master");
    }

    @And("admin Click menu")
    public void admin_click_Menu(){
        tambahDivisiTMS.clickMenu();
        extentTest.log(LogStatus.PASS,"User on Click tambah divisi");
    }

    @Then("Admin go to page tambah divisi")
    public void admin_go_to_page_tambah_divisi() {
        Assert.assertEquals(tambahDivisiTMS.getTXTMasterDivisi(), "");
        extentTest.log(LogStatus.PASS, "User go to page tambah divisi");
    }

// TAMBAH NEW DIVISI

    @When("input new divisi")
    public void input_new_divisi() {
        tambahDivisiTMS.clicknamadivisi();
        extentTest.log(LogStatus.PASS, "cursor on placholder");
    }

    @And("input on placeholder divisi")
    public void input_on_placeholder_divisi() {
        Hooks.delay(1);
        tambahDivisiTMS.inputnamadivisi("oke2");
        extentTest.log(LogStatus.PASS, "Input Oke 2");
    }

    @And("Simpan click")
    public void Simpan_click() {
        Hooks.delay(3);
        tambahDivisiTMS.simpandatadivisi();
        extentTest.log(LogStatus.PASS, "click Button Simpan");
    }

    @Then("Alert Berhasil Simpan")
    public void Alert_Berhasil_Simpan() {
        Hooks.delay(3);
        tambahDivisiTMS.berhasilsimpandatadivisi();
        extentTest.log(LogStatus.PASS, "Alert Berhasil Simpan data");
    }

//SHOW DATA DROPDOWN ENTRIES

    @When("click list dropdown entries")
    public void click_list_dropdown_entries() {
        tambahDivisiTMS.EntriesDatashow();
        extentTest.log(LogStatus.PASS, "Click Dropdown Entries data");
    }

    @Then("Choose 25 Entries data")
    public void Choose_25_Entries_data(){
        Hooks.delay(1);
        tambahDivisiTMS.Entriesshowdata25();
        extentTest.log(LogStatus.PASS, "Click 25 entries data");
    }

    @And("Click List dropdown entries1")
    public void show_list_dropdwon_entries1() {
        tambahDivisiTMS.EntriesDatashow();
        extentTest.log(LogStatus.PASS, "Click Dropdown Entries data");
    }

    @Then("Choose 50 Entries data")
    public void Choose_50_Entries_data() {
        tambahDivisiTMS.Entriesshowdata50();
        extentTest.log(LogStatus.PASS, "Click 50 entries data");
    }

    @And("Click List dropdown entries2")
    public void show_list_dropdwon_entries2() {
        Hooks.delay(1);
        tambahDivisiTMS.EntriesDatashow();
        extentTest.log(LogStatus.PASS, "Click Dropdown Entries data");
    }

    @Then("Choose 100 Entries data")
    public void Choose_100_Entries_data(){
        Hooks.delay(1);
        tambahDivisiTMS.Entriesshowdata100();
        extentTest.log(LogStatus.PASS, "Click 100 entries data");
        driver.navigate().refresh();
    }

// FUNCTION SEARCHBAR

    @When("user click on search bar")
    public void user_click_on_search_bar() {
        tambahDivisiTMS.searchbar();
        extentTest.log(LogStatus.PASS, "Click & Cursor on searchbar");
    }

    @And("user input keyword")
    public void user_input_keyword() {
        tambahDivisiTMS.inputkeywordsearch("gitu ya");
        extentTest.log(LogStatus.PASS, "input keyword on searchbar");
    }

    @And("Result searchbar")
    public void Result_searchbar() {
        tambahDivisiTMS.foundResultSearch();
        extentTest.log(LogStatus.PASS, "show data gitu ya");
        driver.navigate().back();
    }

// DOWNLOAD BUTTON & FUNCTION

    @When("on click button download")
    public void on_Click_button_download(){
        tambahDivisiTMS.clickDownloadButton();
        extentTest.log(LogStatus.PASS,"User on Click button download");
    }

    @Then("direct download template")
    public void direct_download_template(){
        tambahDivisiTMS.downloadedfile();
        extentTest.log(LogStatus.PASS,"File downloaded");
    }

// UPDATE DIVISI

    @When ("Click Icon Edit pen")
    public void Click_Icon_Edit_Pen(){
        Hooks.delay(2);
        tambahDivisiTMS.IconPensil();
        extentTest.log(LogStatus.PASS, "Click & Cursor on searchbar");
    }

    @And ("Edit Nama divisi area")
    public void Click_field_Nama_Divisi() {
        Hooks.delay(2);
        tambahDivisiTMS.inputnamaedit("KurangKurangin");
        extentTest.log(LogStatus.PASS, "kurangKurangin");
        }

    @And ("Click Update")
    public void Click_Update() {
         Hooks.delay(2);
         tambahDivisiTMS.Updatedivisi();
         extentTest.log(LogStatus.PASS, "Update Divisi");
        }

    @Then("Sukses Update")
    public void Sukses_Update() {
         Hooks.delay(1);
         tambahDivisiTMS.berhasilsimpandatadivisi();
         extentTest.log(LogStatus.PASS, "Alert Berhasil Simpan data");
         driver.navigate().refresh();
        }

// UPLOAD DATA BUTTON

    @Given("Click Upload data button")
    public void Click_Upload_data_button(){
        Hooks.delay(1);
        tambahDivisiTMS.goToPopUploadData();
    }

    @When("select file")
    public void select_file(){
        tambahDivisiTMS.selectFile();
        extentTest.log(LogStatus.PASS,"User upload File xlsx");
    }

    @And("click save")
    public void click_save(){
        Hooks.delay(1);
        tambahDivisiTMS.saveUpload();
        extentTest.log(LogStatus.PASS,"Admin click save");
    }

    @Then("Alert Successfull upload data")
    public void Alert_Successfull_upload_data(){
        Hooks.delay(1);
        tambahDivisiTMS.alertSuccsessUploadData();
        extentTest.log(LogStatus.PASS,"Alert sukses upload data");
//        Assert.assertEquals(tambahDivisiTMS.gettxtDashboardAbsenIzin(),"Absen Izin");
    }

// CLOSE POPUP UPLOAD DATA
//    @Given("click upload data")
//    public void Click_Upload_data(){
//    tambahDivisiTMS.goToPopUploadData();
//}
//
//    @When("select file1")
//    public void select_file1(){
//        tambahDivisiTMS.selectFile();
//        extentTest.log(LogStatus.PASS,"User upload File xlsx");
//    }
//
//    @And("click close popup")
//    public void click_close_popup() {
//        tambahDivisiTMS.closebyXpop();
//        extentTest.log(LogStatus.PASS,"close popup button");
//    }
//
//    @Then("page tambah divisi")
//    public void page_tambah_divisi(){
//        Assert.assertEquals("Master Divisi","Master Divisi");
//        extentTest.log(LogStatus.PASS,"User go to page tambah divisi");
//    }

//PAGGING FOOTER DATA

        @And("click page 1")
        public void click_page_1() {
            Hooks.delay(1);
            tambahDivisiTMS.pagging1();
            extentTest.log(LogStatus.PASS, "click paging no 1");
        }

        @Then("click page 2")
        public void click_page_2() {
            Hooks.delay(1);
            tambahDivisiTMS.pagging2();
            extentTest.log(LogStatus.PASS, "click paging no 2");
        }

        @And("click page 3")
        public void click_page_3() {
            Hooks.delay(1);
            tambahDivisiTMS.pagging3();
            extentTest.log(LogStatus.PASS, "click paging no 3");
        }

        @Then("click prev")
        public void click_prev() {
            Hooks.delay(1);
            tambahDivisiTMS.btnPagePrev();
            extentTest.log(LogStatus.PASS, "click paging Prev");
        }

        @And("click next")
        public void click_next() {
            Hooks.delay(1);
            tambahDivisiTMS.paggingnext();
            extentTest.log(LogStatus.PASS, "click paging Next");
            driver.navigate().back();
    }


 //   ASCENDING  DESCENDING COLOMN TABLE

    @When("click asc colomn Action")
    public void click_asc_colomn_Action() {
        tambahDivisiTMS.SortAscAction();
        extentTest.log(LogStatus.PASS, "Click Sort Ascending colomn Action");
    }

    @And("click Desc Colomn Action")
    public void click_Desc_Colomn_Action() {
        tambahDivisiTMS.SortDescAction1();
        extentTest.log(LogStatus.PASS, "Click Sort Desc colomn Action");
    }

    @And("Click Desc colom Nama Divisi")
    public void Click_Desc_colom_Nama_Divisi() {
        tambahDivisiTMS.SortDescNamaDivisi1();
        extentTest.log(LogStatus.PASS, "Click Sort Descending colomn Nama Divisi");
    }

    @Then("Show Desc Data Colomn Nama Divisi")
    public void Show_Desc_Data_Colomn_Nama_Divisi() {
        tambahDivisiTMS.resultDescSortnamaDivisi();
        extentTest.log(LogStatus.PASS, "Succses Desc Nama Divisi");
    }

    @And("Click Asc colomn nama Divisi")
    public void Click_Asc_colomn_Nama_Divisi() {
        Hooks.delay(2);
        tambahDivisiTMS.sortAscNamaDivisi();
        extentTest.log(LogStatus.PASS, "Click Sort Ascending colomn Nama Divisi");
    }

}

