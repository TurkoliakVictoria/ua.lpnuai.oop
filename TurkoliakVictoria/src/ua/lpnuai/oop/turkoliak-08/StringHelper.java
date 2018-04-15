package com.company;

import java.util.Scanner;
import com.company.MenuTool;
public final class StringHelper {
    int size;
    boolean flag=false;
    private String[] strings = new String[20];

    private Scanner scanner = new Scanner(System.in);

    private void copyArray() {
        String[] tmp = new String [strings.length * 2];
        System.arraycopy(strings, 0, tmp, 0, strings.length);
        strings = tmp;
    }

    public void debugmod(boolean t) {
        System.out.println("debug");
        flag=true;
    }

    public void add()
{   if(flag) System.out.println("add text to work with");
    System.out.println("How much strings you want to add");
    if(flag) System.out.println("Waiting for answear");
    size=scanner.nextInt();
    System.out.println("enter");
    if(flag) System.out.println("If size>20 wait because i change the size of array");
    while (size >= strings.length) {
        copyArray();
    }
    if(flag) System.out.println("Waiting for text ");
    for(int i=0;i<=size;i++){
        strings[i] = scanner.nextLine();
        }

}
    public String[] orderByLetter() {
        if(flag) System.out.println("If size>20 wait because i change the size of array");
        while (size >= strings.length) {
            copyArray();
        }
        if(flag) System.out.println("sorting...");
        int steps=0;
        String[] tmp=strings.clone();
        String temp;
        for (int i = 0; i <=size; i++)
        {
            for (int j = i + 1; j <=size; j++)
            {
                if (tmp[i].compareTo(tmp[j])>0)
                {
                    temp = tmp[i];
                    tmp[i] = tmp[j];
                    tmp[j] = temp;
                    steps++;
                }
            }
        }
        System.out.println("Sorted");
        if(flag) System.out.println("It took "+steps+" steps to sort");
        return tmp;
    }

    public String[] orderByLength() {
        if(flag) System.out.println("If size>20 wait because i change the size of array");
        while (size >= strings.length) {
            copyArray();
        }
        int steps=0;
        if(flag) System.out.println("sorting...");
            String[] tmp=strings.clone();
        for (int i=1 ;i<=size; i++)
        {
            String temp = tmp[i];

            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < tmp[j].length())
            {
                tmp[j+1] = tmp[j];
                j--;
                steps++;
            }
            tmp[j+1] = temp;
        }
        System.out.println("Sorted");

        if(flag) System.out.println("It took "+steps+" steps to sort");
        return tmp;
    }
    public void displayText(){
        if(flag) System.out.println("If size>20 wait because i change the size of array");
        while (size >= strings.length) {
            copyArray();
        }
        System.out.println("Your entered");
        for(int i=0;i<=size;i++){
        System.out.println(strings[i]);
        }
        if(flag) System.out.println("Sorted in both ways(we are sorting copies!)");
        System.out.println("Do you want to see sorted array separetely? 1-Yes,2-NO");
        int d=scanner.nextInt();
        if(d==1) {
            System.out.println("Sorted by length");
            for (int i = 0; i <= size; i++) {
                System.out.println(orderByLength()[i]);
            }
            for(int i=0;i<=size;i++){
                System.out.println(orderByLetter()[i]);}
        }
        for(int i=0;i<=size;i++){
            System.out.println(order()[i]);
        }

        }
public String[]  order(){
        int steps=0;
    String[] tmp=strings.clone();
    String temp;
    for (int i = 0; i <=size; i++)
    {
        for (int j = i + 1; j <=size; j++)
        {
            if (tmp[i].compareTo(tmp[j])>0)
            {
                temp = tmp[i];
                tmp[i] = tmp[j];
                tmp[j] = temp;
                steps++;
            }
        }
    }
    for (int i=1 ;i<=size; i++)
    {
        String t = tmp[i];

        // Insert s[j] at its correct position
        int j = i - 1;
        while (j >= 0 && t.length() < tmp[j].length())
        {
            tmp[j+1] = tmp[j];
            j--;
            steps++;
        }
        tmp[j+1] = t;
    }
    return tmp;

}

    private String getInputString(String message){
        System.out.print(message);
        String input = "";
        while (input.isEmpty()) {
            input = scanner.nextLine();
        }
        return input;
    }






    }

