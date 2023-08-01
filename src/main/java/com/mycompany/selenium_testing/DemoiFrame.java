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

/**
 *
 * @author Dell
 */
public class DemoiFrame {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.manage().window().maximize();
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id= 'iframeResult']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("/html/body/button")).click();
        String text1 = driver.switchTo().alert().getText();
        System.out.println(text1);
        
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
                
        
        
    }

    
    
}
