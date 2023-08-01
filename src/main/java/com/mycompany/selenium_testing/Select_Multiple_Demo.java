/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selenium_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Dell
 */
public class Select_Multiple_Demo {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        driver.manage().window().maximize();
        WebElement mSelect  = driver.findElement(By.id("multi-select"));
        Select select = new Select(mSelect);
        select.selectByIndex(3);
        select.selectByValue("Texas");
        select.selectByVisibleText("Washington");
        List<WebElement> List_ele= select.getAllSelectedOptions();
        System.out.println(List_ele.size());
        select.deselectByIndex(3);
        System.out.println(List_ele.size());
                
        
    }
    
}
