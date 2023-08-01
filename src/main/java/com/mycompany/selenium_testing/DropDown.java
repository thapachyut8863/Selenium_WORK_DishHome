/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selenium_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Dell
 */
public class DropDown {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        WebElement dropdown = driver.findElement(By.id("how-select"));
        //creating the object of select class for select tag name.
        Select select = new Select(dropdown);
        select.selectByIndex(5);
        Thread.sleep(200);
        System.out.println("5 is selected");
        select.selectByValue("Podcast");
        Thread.sleep(200);
        System.out.println("Podcast is selected");
        select.selectByVisibleText("YouTube");
        Thread.sleep(200);
        System.out.println("YouTube is selected");
             
        
        
    }
    
}
