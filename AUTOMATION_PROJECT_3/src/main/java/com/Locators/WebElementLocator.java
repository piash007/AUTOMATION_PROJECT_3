package com.Locators;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementLocator extends TestBase {
    public static void main(String[] args) {
        chrome_launch();
        OpenUrl("https://demo.opencart.com");
        OpenLoginPage();
        TC_loginTest();

    }

    public static void OpenLoginPage(){
        WebElement MyAccount= driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Login= driver.findElement(By.linkText("Login"));
        Login.click();
    }

    public static void TC_loginTest(){
        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("kowshikkumarpiash133@gmail.com");

        WebElement pass= driver.findElement(By.name("password"));
        pass.sendKeys("12345");

        WebElement login_btn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        login_btn.click();
    }




}
