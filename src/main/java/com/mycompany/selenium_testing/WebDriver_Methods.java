/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selenium_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Dell
 */
public class WebDriver_Methods {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverManager.chromedriver().setup();
        
        driver.get("http://192.168.20.149:8013/");
        //too get the current url of the browser
        String CurrentURL = driver.getCurrentUrl();
        System.out.println("the current URL is" + " "+ CurrentURL);
        String title = driver.getTitle();
        System.out.println("the title of the page is:"+ " " + title);
        driver.navigate().to("http://demo1.dishhome.com.np:82/#/ppv-movie");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();
          
    }
    
}
