/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.selenium_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Dell
 */


public class MySeleniumTest {
    public static void main(String[] args) {
        
        // Set the path to ChromeDriver executable
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Selenium\\ChromeDriverSet\\chromedriver.exe");
//below code is done to replace thea above code.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
 
        
        driver.get("http://192.168.20.149:8013");
        driver.findElement(By.xpath("//*[@class = \"mr-2 d-inline text-red-900 medium\"]")).click();
        WebElement username = driver.findElement(By.xpath("//*[@type=\"email\"]"));
        username.sendKeys("Achyut Thapa");
        WebElement Password = driver.findElement(By.xpath("//*[@type=\"password\"]"));
        Password.sendKeys("Achyut@1243");
        
        
        
    }
}
