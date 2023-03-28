package com.juaracoding.tms;

public enum TestScenarios {
    T1("Admin successful login into web TMS"),
    T2("User invalid Login into web TMS");

    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
