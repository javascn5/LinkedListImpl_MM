package com.sda.git;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // Arraylist - implementacja tablicowa
        // LinkedList - implementacja 

        List<String> list = new LinkedList<>();

        list.add("Jan");
        list.add("Marczin");
        list.add("Karol");

        for(String l: list)
            System.out.println(l);


    }
}
