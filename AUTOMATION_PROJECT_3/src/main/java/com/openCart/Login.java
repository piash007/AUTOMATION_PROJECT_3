package com.openCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Login extends TestBase {
    public static void main(String[] args) throws IOException {
        chrome_launch();
        OpenUrl("https://demo.opencart.com");
        OpenLoginPage();
        RandomEmail();
        TC_valid_loginTest();

    }

    public static void OpenLoginPage() {
        WebElement MyAccount = driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Login = driver.findElement(By.linkText("Login"));
        Login.click();
    }



    public static void TC_valid_loginTest() throws IOException {
        FileInputStream fis= new FileInputStream("./src/main/resources/Data.properties");
        Properties prop= new Properties();

        prop.load(fis);

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys(prop.getProperty("RandomEmail"));

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys(prop.getProperty("RandomPass"));

        WebElement login_btn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        login_btn.click();
    }

}


