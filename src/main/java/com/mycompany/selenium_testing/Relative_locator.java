/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selenium_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

/**
 *
 * @author Dell
 */
public class Relative_locator {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        
        driver.get("http://192.168.20.149:8013/");
        driver.findElement(By.xpath("//*[@class=\"mr-2 d-inline text-red-900 medium\"]")).click();
        
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("Achyut123");

        
       
        password.sendKeys("Achyut123");
        
        
        
    }
    
}
