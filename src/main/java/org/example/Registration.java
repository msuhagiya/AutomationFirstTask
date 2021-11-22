package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
    static WebDriver driver;
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //Type URL
        driver.get("https://demo.nopcommerce.com/");
        //Maximize the screen
        driver.manage().window().maximize();
        //Click on register button
        driver.findElement(By.linkText("Register")).click();
        //print the "Your Personal Detail"
        String actualText= driver.findElement(By.xpath("//form/div[1]/div[@class=\"title\"]/strong")).getText();
        System.out.println(actualText);
        //enter the first name
        driver.findElement(By.id("FirstName")).sendKeys("Navya");
        //enter the lastname
        driver.findElement(By.id("LastName")).sendKeys("patel");
        //Enter email address
        driver.findElement(By.id("Email")).sendKeys("def@gmail.com");
        //Enter password
        driver.findElement(By.id("Password")).sendKeys("abc123");
        //Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("abc123");
        //click on Register
        driver.findElement(By.id("register-button")).click();
        //Print the message "Your Registration Completed"
       String actualText1 = driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(actualText1);
        driver.close();
    }
}
