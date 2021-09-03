package com.openCart;

import com.Base.TestBase;

public class titleVerify extends TestBase {
    public static void main(String[] args) {
        chrome_launch();
        OpenUrl("https://demo.opencart.com");
        Login.OpenLoginPage();
        Tc_Valid_Title_Verify();

    }

    public static void Tc_Valid_Title_Verify() {
        String ExpectedTitle = "Account Login";
        String ActualTitle = driver.getTitle();

        if (ExpectedTitle.equals(ActualTitle)) {
            System.out.println("Test Passed,Login Page Open");
        } else {
            System.out.println("Test Failed,different Page Open");
        }
    }
}

