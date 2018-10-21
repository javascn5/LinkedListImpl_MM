package com.sda.git;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // Arraylist - implementacja tablicowa
        // LinkedList - implementacja wiazan

        CustomList<String> customList = new CustomLinkedList<>();

        customList.add("Jeden");
        customList.add("Dwa");
        customList.add("Trzy");
        customList.add("Cztery");
        customList.add("Pięc");
        customList.add("Sześć");
        customList.add("Siedem");

        customList.printList();

        List<String> list = new LinkedList<>();

        list.add("Jan");
        list.add("Marczin");
        list.add("Karol");

        for(String l: list)
            System.out.println(l);

        System.out.println("======================================================");
        customList.find(3);

    }
}
