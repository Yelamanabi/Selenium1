package com.cybertek.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WebOrderUtil {
    /**
     * Simply navigate to WebOrderApp
     */
    public static void openWebOrderApp(){

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx") ;

    }
}
