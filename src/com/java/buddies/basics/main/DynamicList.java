package com.java.buddies.basics.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicList {

    public static final String[] NAMES_DB = {"Fabian", "Omar", "Jhunior", "Martin", "Lorena"};

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(NAMES_DB));

        for(String name: nameList) {
            System.out.println(name);
        }

        System.out.println("#######################");

        nameList.add("Yoau");
        for(String name: nameList) {
            System.out.println(name);
        }

        System.out.println("#######################");
        nameList.remove(1);
        for(String name: nameList) {
            System.out.println(name);
        }

    }
}