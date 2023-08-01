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
public class PrintAllLinks {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        
        List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
        System.out.println("The total number of links in this page is: "+ AllLinks.size());
        for(int i = 0; i< AllLinks.size(); i++){
        System.out.println(AllLinks.get(i).getAttribute("href"));
        System.out.println("Text in the page:" + AllLinks.get(i).getText());
        }
        
    }
    
}
