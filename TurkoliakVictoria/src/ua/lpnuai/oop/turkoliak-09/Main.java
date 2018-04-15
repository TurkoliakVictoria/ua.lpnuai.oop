package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] array = new String[3];
        array[0] = "Test";
        array[1] = "Java .";
        array[2] = "look";
        Container container = new Container(array);
        for (String item : container) {
            System.out.println(item);
        }

        container.add("Add");
        if (container.find("Add")) {
            System.out.println("checked");
        }

        Container.Iterator it = container.iterator();

        for (String item : container) {
            System.out.println(item);
        }

        System.out.println("to String"+container.toString());
        System.out.println(container.toArray().toString());

        while (it.hasNext()) {
            String curr = (String) it.next();
            System.out.println(curr);
        }


    }
    }

