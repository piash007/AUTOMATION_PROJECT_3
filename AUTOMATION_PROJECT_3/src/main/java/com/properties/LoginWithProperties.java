package com.properties;

import com.Base.TestBase;
import com.openCart.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginWithProperties extends TestBase {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("./src/main/resources/Data.properties");
        Properties prop= new Properties();

        prop.load(fis);

        chrome_launch();
        OpenUrl("https://demo.opencart.com");
        Login.OpenLoginPage();

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys(prop.getProperty("RandomEmail"));

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys(prop.getProperty("password"));

        WebElement login_btn= driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        login_btn.click();
    }
}
