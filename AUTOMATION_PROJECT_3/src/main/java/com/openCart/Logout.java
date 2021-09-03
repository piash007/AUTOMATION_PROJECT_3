package com.openCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Logout extends TestBase {
    public static void main(String[] args) throws IOException {
        chrome_launch();
        OpenUrl("https://demo.opencart.com");
        Login.OpenLoginPage();
        Login.TC_valid_loginTest();
        logout();
    }

    public static void logout(){
        WebElement Logout = driver.findElement(By.linkText("Logout"));
        Logout.click();

    }
}
