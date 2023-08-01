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
import org.openqa.selenium.support.locators.RelativeLocator;

/**
 *
 * @author Dell
 */
public class Selenium_below {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://192.168.20.149:8013/");
        driver.findElement(By.xpath("//*[@class = \"mr-2 d-inline text-red-900 medium\"]")).click();
        
        WebElement username = driver.findElement(By.xpath("//*[@id=\"Input_Email\"]"));
        username.sendKeys("achyutthapa6@gmail.com");
        WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(username));
        password.sendKeys("Achyut@123");
        driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
}
}