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
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author Dell
 */
public class Drag_and_Drop {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        //first select the frame you want other wise it may raise an error.
        WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        driver.switchTo().frame(frame);
        WebElement dragable = driver.findElement(By.xpath("//*[@id ='draggable']"));
        WebElement dropable = driver.findElement(By.xpath("//*[@id ='droppable']"));
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragable, dropable).perform();
        
        
        
        
    }
    
}
