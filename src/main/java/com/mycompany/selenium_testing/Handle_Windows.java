/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selenium_testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Dell
 */
public class Handle_Windows {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class = 'cta_button']")).click();
        Set<String> WindowHandles= driver.getWindowHandles();
        System.out.println("The set of window handles are:"+ WindowHandles);
        Iterator<String> iterator =WindowHandles.iterator();
        String parentWindow = iterator.next();
        System.out.println("the handles for parent window is:"+ parentWindow);
        String childWindow = iterator.next();
        System.out.println("The handels for children window is:"+childWindow);
        driver.switchTo().window(childWindow);
        
        driver.findElement(By.name("UserFirstName")).sendKeys("Achyut");
        driver.findElement(By.name("UserLastName")).sendKeys("Thapa");
        driver.switchTo().window(parentWindow);
        
    }
    
}
