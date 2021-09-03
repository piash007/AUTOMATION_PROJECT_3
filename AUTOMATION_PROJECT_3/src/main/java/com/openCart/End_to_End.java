package com.openCart;

import com.Base.TestBase;

import java.io.IOException;

import static com.Base.TestBase.chrome_launch;
import static com.openCart.Login.OpenLoginPage;
import static com.openCart.Login.TC_valid_loginTest;

public class End_to_End extends TestBase {
    public static void main(String[] args) throws IOException {
        String homePage= "https://demo.opencart.com";
        chrome_launch();
        OpenUrl(homePage);
        RandomEmail();
        Registration.OpenRegistrationPage();
        Registration.Valid_RegistrationTest_properties();
        Logout.logout();
        Login.OpenLoginPage();
        Login.TC_valid_loginTest();
        Logout.logout();

    }
}
