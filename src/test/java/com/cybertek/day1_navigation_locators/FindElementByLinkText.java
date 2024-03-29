package com.cybertek.day1_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLinkText {
    public static void main(String[] args) throws InterruptedException {
        //set up chrome driver . open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //navigate to https://google.com
        driver.get("https://google.com");
        //try to identify search box using both name and id
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Austin Harding ");
        //submit the searching by clicking on the search button
        WebElement searchBtn = driver.findElement(By.name("btnK"));
        searchBtn.submit();

        //navigate back to google home page
driver.navigate().back();;
        //wait few second
Thread.sleep(3000);
        //click on about link
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        aboutLink.click();
        Thread.sleep(3000);
        driver.quit();
    }



}
