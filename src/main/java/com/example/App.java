package com.example;

/**
 * Hello world!
 *
 */
 import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
        //https://support.saucelabs.com/s/login/?language=en_US
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
        driver.findElement(By.id("login-button")).click();
        
        Thread.sleep(3000);
        
        driver.quit();
    }
}
