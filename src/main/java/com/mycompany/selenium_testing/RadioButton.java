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
public class RadioButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.singaporeair.com/en_UK/np/home#/book/bookflight");
        driver.manage().window().maximize();
        List<WebElement> radio = driver.findElements(By.xpath("//input[@type = 'radio']"));
        System.out.println(radio.size());
        for(int i = 0; i< radio.size(); i++){
            System.out.println("the text are: "+radio.get(i).getText());
        }
        
              
    }
    
}
