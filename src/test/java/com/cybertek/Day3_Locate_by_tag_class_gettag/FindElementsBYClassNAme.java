package com.cybertek.Day3_Locate_by_tag_class_gettag;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsBYClassNAme {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement element1 = driver.findElement(By.className("h1y"));
        System.out.println("element1.getText() = " + element1.getText());
        
        
        WebElement firstLiItem = driver.findElement(By.className("List-group-item"));
        System.out.println("firstLiItem.getText() = " + firstLiItem.getText());

        List<WebElement> allLiTadElements = driver.findElements(By.className("List-group-item"));
        System.out.println("allLiTadElements.size = " + allLiTadElements.size());

        


        driver.quit();
    }
}
