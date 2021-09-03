package com.Locators;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.Locators.WebElementLocator.OpenLoginPage;
import static com.Locators.WebElementLocator.TC_loginTest;

public class WebElementLocator_Registration extends TestBase {
    public static void main(String[] args) {
        chrome_launch();
        OpenUrl("https://demo.opencart.com");
        OpenRegistrationPage();
        RegistrationTest();


    }

    public static void OpenRegistrationPage(){
        WebElement MyAccount= driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Register= driver.findElement(By.linkText("Register"));
        Register.click();
    }

    public static void RegistrationTest(){
        WebElement firstname= driver.findElement(By.name("firstname"));
        firstname.sendKeys("Piash");

        WebElement lastname= driver.findElement(By.name("lastname"));
        lastname.sendKeys("Roy");

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("piashroy@gmail.com");

        WebElement telephone= driver.findElement(By.name("telephone"));
        telephone.sendKeys("01677520375");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("12345");

        WebElement con_password= driver.findElement(By.name("confirm"));
        con_password.sendKeys("12345");

        WebElement con_btn= driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        con_btn.click();
    }
}
