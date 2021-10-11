package com.cybertek.Day4_common_elements_xpath_css;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class LocatingRadioButtons {
    // radio buttons can be checked and usually come in group
    //  That's the only attribute special about the element
    // we can use additional method called isSelected() to determine if it's checked

    // open chrome navigate here http://practice.cybertekschool.com/radiobuttons

    public static void main(String[] args) {
        // open chrome navigate here http://practice.cybertekschool.com/radiobuttons
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locate the blue radio button
        WebElement blueRadio = driver.findElement(By.id("blue"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());//true cuz its already selected
        blueRadio.click();//nothing will happen  cuz its already selected

        WebElement redRadio = driver.findElement(By.id("red"));
        System.out.println("redRadio.isSelected() = "
                + redRadio.isSelected());
        redRadio.click();//this will click to chek radio button
        System.out.println(" after click redRadio.isSelected() = " + redRadio.isSelected());

        //check bue radio button status

        System.out.println("after red is click blueRadio.isSelected() = " + blueRadio.isSelected());

        WebElement greenRadio = driver.findElement(By.id("green"));
        greenRadio.click();

        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());

        System.out.println("greenRadio.isEnabled() = " + greenRadio.isEnabled());

        //a radio group is grouped by its name attribute
        //all radio buttons related to color has name color in this case
        List<WebElement> allColorRadios = driver.findElements(By.name("color"));
        // chrck the size to see how many radio button identified
        System.out.println("allColorRadios.size = " + allColorRadios.size());

        //click on third radio button
        allColorRadios.get(2).click();

        //loop over all time elements to print these : id attribute . is Selected . isEnable
        //allRadios.iter and hit enter and give each element a name
        for (WebElement eachColorRadio : allColorRadios) {
            System.out.println("------------------");
            System.out.println("eachColorRadio.getAttribute(\"id\") = " + eachColorRadio.getAttribute("id"));
            System.out.println("eachColorRadio.isSelected() = " + eachColorRadio.isSelected());
            System.out.println("eachColorRadio.isEnabled() = " + eachColorRadio.isEnabled());
            System.out.println("------------------");



        }





            //close
            driver.quit();

        }
    }

