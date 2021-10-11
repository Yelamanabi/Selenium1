package com.cybertek.Day2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialTextPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        //click on first link A/B Testing
       // WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
        //firstLink.click();

        driver.findElement(By.linkText("A/B Testing")).click();
        //navigate back to home page
         driver.navigate().back();
         //maximize the screen here
        driver.manage().window().maximize();
        //click on second link
        //driver.findElement(By.linkText("Add/Remove Elements")).click();
        WebElement addOrRemoveLink = driver.findElement(By.partialLinkText("Add/Remove"));
        addOrRemoveLink.click();
        //click on "Home" link to go back home
        driver.findElement(By.linkText("Home")).click();

        //click on "Redirect Link"
driver.findElement(By.linkText("Redirect Link")).click();
        //close browser
        driver.close();



    }
}
