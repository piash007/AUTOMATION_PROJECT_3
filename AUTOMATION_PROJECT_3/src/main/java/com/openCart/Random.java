package com.openCart;

public class Random {
    protected static String RandomName(){
        String SALTCHAR = "abcdefABCDEF1234";
        StringBuilder salt = new StringBuilder();
        java.util.Random rnd= new java.util.Random();

        while(salt.length()<7){
            int index= (int)(rnd.nextFloat()*SALTCHAR.length());
            salt.append(SALTCHAR.charAt(index));
        }
        String saltStar= salt.toString();
        return saltStar;

    }

    public static String Email= RandomName().concat("@gmail.com");
    public static String pass= RandomName();

}
