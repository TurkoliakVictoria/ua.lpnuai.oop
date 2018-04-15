package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] array = new String[3];
        array[0] = "Tested";
        array[1] = "Javha .";
        array[2] = "loojk";
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

        System.out.println("enter 1 string to manip");
        String str=scanner.nextLine();
        System.out.println("1-add string,2-find,3-sort,4-delete all strings,5-display array,6-exit");
        System.out.println("enter what you want to do");
        int k=scanner.nextInt();
            if(k==1){
                container.add(str);
                for (String item : container) {
                    System.out.println(item);
                }
            }
            else if(k==2){
                System.out.println(container.find(str));
            }
            else if(k==3) {
                container.sort();
                for (int i = 0; i < array.length; i++)
                    System.out.println(container.sort()[i]);
            }
            else if(k==4){
                container.deleteAll();
            }
            else if(k==5) {
                for (int i =0;i<array.length;i++)
                System.out.println(array[i]);
            }
            else if(k==6){
                System.out.println("Goodbye");
                return;
            }
        }

    }


