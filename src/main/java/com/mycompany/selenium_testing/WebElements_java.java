/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selenium_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Dell
 */
public class WebElements_java {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://192.168.20.149:8013/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()= 'Login']")).click();
        driver.findElement(By.xpath("//input[contains(@type, 'email')]")).sendKeys("Achyut");
        driver.findElement(By.xpath("//input[contains(@type, 'email')]")).clear();
        driver.findElement(By.xpath("//span[text()= 'Login']")).isEnabled();
//        driver.findElement(By.xpath("//input[contains(@type, 'email']")).isDisplayed();
//        driver.findElement(By.xpath("//input[contains(@type, 'email']")).isSelected();
        
        
    }
    
}
