package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuildComputer {
    static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //Type URL
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //Click on Computers category from menu
        driver.findElement(By.linkText("Computers")).click();
        //Click on sub category Desktops
        driver.findElement(By.linkText("Desktops")).click();
        //click on item build your own computer
        driver.findElement(By.linkText("Build your own computer")).click();
        //print Build your own computer
        String actualText= driver.findElement(By.xpath("//div[@class='product-name']/h1")).getText();
        System.out.println(actualText);
        //Close the window
        driver.close();
    }
}
