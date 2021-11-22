package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComments {
    static WebDriver driver;

    public static void main(String[] args)
    {
     System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");
     driver = new ChromeDriver();
     //Open URL
     driver.get("https://demo.nopcommerce.com/");
     driver.manage().window().maximize();
     //Click on News option from Customer service
        driver.findElement(By.linkText("News")).click();
        //Click on details
        driver.findElement(By.linkText("DETAILS")).click();
        //Type the Title
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("New");
        //Type comment
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("This is new comment");
        //Click on new comment
        driver.findElement(By.xpath("//div[@class='buttons']/button")).click();
        //Print message News comment is successfully added.
        String actualText = driver.findElement(By.xpath("//div[@class='notifications']/div")).getText();
        System.out.println(actualText);
        driver.close();


    }
}
