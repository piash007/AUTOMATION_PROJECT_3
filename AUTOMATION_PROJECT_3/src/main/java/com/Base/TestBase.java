package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;

    public static void firefox_launch(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver= new FirefoxDriver();
    }

    public static void chrome_launch(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static String RandomEmail() throws IOException {
        FileOutputStream fis= new FileOutputStream("./src/main/resources/Data.properties");
        Properties prop= new Properties();

        String SALTCHAR = "abcdefABCDEF1234";
        StringBuilder salt = new StringBuilder();
        java.util.Random rnd= new java.util.Random();

        while(salt.length()<7){
            int index= (int)(rnd.nextFloat()*SALTCHAR.length());
            salt.append(SALTCHAR.charAt(index));
        }
        String saltStar= salt.toString().concat("@gmail.com");
        prop.setProperty("RandomEmail",saltStar);
        prop.store(fis,null);
        return saltStar;

    }

    public static void OpenUrl(String URL){
        driver.get(URL);
    }

    public static void browser_close() {
        driver.close();
    }
}
