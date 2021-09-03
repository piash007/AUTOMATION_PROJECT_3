package com.properties;

import java.io.*;
import java.util.Properties;

public class writeProperties {
    public static void main(String[] args) throws IOException {
        FileOutputStream fis= new FileOutputStream("./src/main/resources/Data.properties");
        Properties prop= new Properties();

        prop.setProperty("Name","Piash Roy");
        prop.setProperty("Email","piash.roy@gmail.com");

        prop.store(fis,null);
    }
}
