package com.BrowserSetup;

import com.Base.TestBase;
import org.openqa.selenium.Dimension;

import static com.BrowserSetup.BrowserConfig.chrome_launch;

public class WindowSize extends TestBase {
    public static void main(String[] args) {

        chrome_launch();
        getWindowSize();
        setWindowSize(600,900);
    }

    public static void getWindowSize(){
        int height= driver.manage().window().getSize().getHeight();//744
        int width= driver.manage().window().getSize().getWidth();//1382
        System.out.println("Full height:" +height);
        System.out.println("Full width:" +width);
    }

    public static void setWindowSize(int Height,int Width){
         driver.manage().window().setSize(new Dimension(1200,500));

        int height= driver.manage().window().getSize().getHeight();
        int width= driver.manage().window().getSize().getWidth();
        System.out.println("New height:" +height);
        System.out.println("New width:" +width);

    }
}
