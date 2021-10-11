package com.cybertek.Day2_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindMultipleElements {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        //get all the link that have partial text A in it

          List<WebElement> allLinks = driver.findElements(By.partialLinkText("A"));
        //get the size of this list so we know how many link with partial text A
        System.out.println("allLinks.size() = " + allLinks.size());


        // get first item and get the text
        WebElement firstitem = allLinks.get(0);
        System.out.println("firstitem.getText = " + firstitem.getText());;

        WebElement secondtitem = allLinks.get(0);
        System.out.println("seconditem.getText = " + secondtitem.getText());;

        //iterate over whole list and print out the text
        for (WebElement eachElement :allLinks)

            System.out.println("eachElement.getText() = " + eachElement.getText());





        driver.quit();
    }
}
