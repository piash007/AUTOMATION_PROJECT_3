package com.openCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import static com.Locators.WebElementLocator_Registration.OpenRegistrationPage;
import static com.Locators.WebElementLocator_Registration.RegistrationTest;

public class Registration extends TestBase {
    public static void main(String[] args) throws IOException {
        chrome_launch();
        OpenUrl("https://demo.opencart.com");
        OpenRegistrationPage();
        RandomEmail();
        Valid_RegistrationTest_properties();


    }

    public static void OpenRegistrationPage(){
        WebElement MyAccount= driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Register= driver.findElement(By.linkText("Register"));
        Register.click();
    }



    public static void Valid_RegistrationTest_properties() throws IOException {
        FileInputStream fis= new FileInputStream("./src/main/resources/Data.properties");
        Properties prop= new Properties();

        prop.load(fis);

        WebElement firstname= driver.findElement(By.name("firstname"));
        firstname.sendKeys("Piash");

        WebElement lastname= driver.findElement(By.name("lastname"));
        lastname.sendKeys("Roy");

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys(prop.getProperty("RandomEmail"));

        WebElement telephone= driver.findElement(By.name("telephone"));
        telephone.sendKeys("01677520375");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("1234567");

        WebElement con_password= driver.findElement(By.name("confirm"));
        con_password.sendKeys("1234567");

        WebElement con_btn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        con_btn.click();

        WebElement agree_btn= driver.findElement(By.name("agree"));
        agree_btn.click();

        WebElement continue_btn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        continue_btn.click();

    }


}
