package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/abrarshameem/IdeaProjects/Amazon/src/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

    }

    @Test
    public void test1() throws InterruptedException {
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "title validation success");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    public void test2() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium book");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    public void test3() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("blow dryer");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test4() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("20lb basmati rice");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test5() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 12 Pro Max");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test6() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("OnePlus 10 Pro");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    public void test7() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iMac Pro M1");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test8() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Starbucks Coffee Triple Shot");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test9() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Certified Lover Boy");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    @Test
    public void test10() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Donda");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
