package com.BrowserSetup;

import com.Base.TestBase;

import static com.BrowserSetup.BrowserConfig.firefox_launch;

public class OpenWebsite extends TestBase {
    public static void main(String[] args) {
        firefox_launch();
        OpenUrl("https://google.com");
    }
}
