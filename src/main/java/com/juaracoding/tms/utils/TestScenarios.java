package com.juaracoding.tms.utils;

public enum TestScenarios {
    T1("Admin successful login into web TMS"),
    T2("User invalid Login into web TMS"),
    T3("User Staff1 Valid Login into web TMS"),
    T4("User Staff2 Valid Login into web TMS"),
    T5("User Staff3 Valid Login into web TMS"),
    T6("User Staff4 Valid Login into web TMS"),
    T7("User Staff5 Valid Login into web TMS"),
    T8("User staff invalid null password login into web TMS"),
    T9("User staff invalid null username login into web TMS"),
    T10("User staff invalid null username dan null password login into web TMS"),
    T11("User Admin invalid password login into web TMS"),
    T12("User Admin invalid login into web TMS"),
    T13("User Admin input null password login into web TMS"),
    T14("User Admin input null username login into web TMS");

    private String testCaseName;
    TestScenarios(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
