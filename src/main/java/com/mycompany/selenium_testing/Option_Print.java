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

/**
 *
 * @author Dell
 */
public class Option_Print {
    public static WebDriver driver;
    
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        driver.manage().window().maximize();
        List<WebElement> dropDownList =driver.findElements(By.tagName("option"));
        System.out.println("The total number of Dropdown Option is:" + dropDownList.size());
        for(int i = 0; i< dropDownList.size(); i++){
            System.out.println("The name of the DropDown objects are:" + dropDownList.get(i).getAttribute("value"));
        }
        
        
        
    }
    
}
