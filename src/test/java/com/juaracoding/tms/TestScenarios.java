package com.juaracoding.tms;

public enum TestScenarios {

// ========== 01 Tambah Divisi TMS==================//
    T1("Admin successful login into web TMS"),
    T2("Buka Halaman tambah divisi"),
    T3("Tambah New Diviasi"),
    T4("SHOW DATA DROPDOWN ENTRIES"),
    T5("FUNCTION SEARCHBAR"),
    T6("DOWNLOAD BUTTON & FUNCTION"),
    T7("UPDATE DIVISI"),
    T8("UPLOAD DATA BUTTON"),
    T9("PAGGING FOOTER DATA"),
    T10("ASCENDING & DESCENDING COLOMN TABLE "),

// ========== 02 MANAGEMENT DIVISI==================//
    T11("Admin successful login into web TMS"),
    T12("FUNCTION DOWNLOAD MANAGEMENT DIVISI & TEMPLATE"),
    T13("FUNCTION UPLOAD DATA"),
    T14("ENTRIES DATA FUNCTION"),
    T15("FUNCTION SEARCH BAR"),
    T16("EDIT MANAGEMENT DIVISI"),
    T17("DELETE DATA"),
    T18("TAMBAH MANAGEMENT DIVISI");

    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
