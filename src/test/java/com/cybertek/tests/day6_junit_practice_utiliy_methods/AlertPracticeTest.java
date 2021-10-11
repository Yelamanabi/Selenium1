package com.cybertek.tests.day6_junit_practice_utiliy_methods;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AlertPracticeTest extends TestBase {

    @Test
    public void testJavaScriptAlert(){

        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //alert inteface from silenium is used to deal with alerts
        //your driver object can switchTo the alert and take action on it

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        //driver first need to swithc to the alert box since its not part of html
        //using swithTo() method followed by alert() method
        //and it has 4 methods:
        //- accept() ----> click ok button
        //- dismiss() ---->click on cancel button
        //- sendKey(yourText)----> Enter text into prompt
        driver.switchTo().alert().accept();
   //     Alert alertObj = driver.swithTo.alert();
        //alertObj.accept();

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();

        driver.switchTo().alert().accept();//this willl click on dismiss button on the confirmation box

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();//click ok






        System.out.println("THE END");
    }

}
