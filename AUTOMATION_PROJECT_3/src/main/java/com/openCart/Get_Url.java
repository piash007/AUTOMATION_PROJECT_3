package com.openCart;

import com.Base.TestBase;

public class Get_Url extends TestBase {
    public static void main(String[] args) {
        chrome_launch();
        OpenUrl("https://demo.opencart.com");
        Login.OpenLoginPage();
        Tc_Valid_URL_Verify();

    }

    public static void Tc_Valid_URL_Verify(){
        String ExpectedURL = "https://demo.opencart.com/index.php?route=account/login";
        String ActualURL = driver.getCurrentUrl();

        if (ExpectedURL.equals(ActualURL)) {
            System.out.println("Test Passed,Login Page Open");
        } else {
            System.out.println("Test Failed,different Page Open");
        }
    }

}
