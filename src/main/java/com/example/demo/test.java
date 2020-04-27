package com.example.demo;

public class test {

    public static void main(String[] args) {

        String time = "20200109";

        String y = time.substring(0, 4);
        String m = time.substring(4, 6).replaceAll("0\\d",time.substring(5 , 6));
        String d = time.substring(6, 8).replaceAll("0\\d",time.substring(7 , 8));
        System.out.println(y+"/"+m+"/"+d);


    }

}
