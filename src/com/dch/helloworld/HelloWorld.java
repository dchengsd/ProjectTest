package com.dch.helloworld;

import java.util.HashMap;

public class HelloWorld {

    public static void main(String[] args){

        testHashMap();

        test();

//        System.out.println("Hello World!");
    }

    public static void  test(){
        System.out.println("Hello World!!");

    }

    public static void testHashMap(){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name","dch");
        map.put("age", "12");
        map.put("school", "UCAS");
        map.put("major", "computer");

        String name = map.get("name");
        System.out.println(name);
        System.out.println("name = " + name);
    }
    

}
