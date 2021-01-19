package com.cucumber.junit.hooks;

import com.cucumber.junit.driver.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class HooksDriver {
    @Before
    public static void setUpDriver() {
        DriverManager.setUpDriver();
    }

    @After
    public static void quitDriver() {
        //DriverManager.quitDriver();
    }
}
