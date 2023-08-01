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
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Dell
 */
public class WebDriver_Test {
    public static WebDriver driver;
    public static String browser = "firefox";
    public static void main(String[] args) {
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
        }
        else if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            
        }
        driver.get("http://192.168.20.149:8013");
        driver.findElement(By.xpath("//*[@class = \"mr-2 d-inline text-red-900 medium\"]")).click();
        WebElement username = driver.findElement(By.xpath("//*[@type=\"email\"]"));
        username.sendKeys("Achyut Thapa");
        WebElement Password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        Password.sendKeys("Achyut@1243");
        
        
    }
    
        
        
    
    
}
