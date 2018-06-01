package ua.lpnuai.oop.turkoliak-13;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] arr = new int[200];
    static long time;

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        time = in.nextLong();


        for (int i = 0; i < 10; i++) {
            arr[i] = i ;
        }
        System.out.println("do you want to take a break?Choose thread to sleep) ");
        int k=in.nextInt();

        Runnable task1 = new Runnable1(arr, 4);
        Thread thread1 = new Thread(task1);
        thread1.setName("Find number");
        thread1.start();
        if(k==1){
            System.out.println("thread "+k+" is sleeping.10 seconds pls");
        thread1.sleep(10000);}
        Runnable task2 = new Runnable2(arr, 4);
        Thread thread2 = new Thread(task2);
        thread2.setName("Find first instance");
        thread2.start();
        if(k==2){
            System.out.println("thread "+k+" is sleeping.10 seconds pls");
            thread2.sleep(10000);}
        Runnable task3 = new Runnable3(arr);
        Thread thread3 = new Thread(task3);
        thread3.setName("Sum");
        thread3.start();
        if(k==3){
            System.out.println("thread "+k+" is sleeping.10 seconds pls");
            thread3.sleep(10000);}
        Runnable task4 = new Runnable4(arr);
        Thread thread4 = new Thread(task4);
        thread4.setName("Min Max");
        thread4.start();
        if(k==4){
            System.out.println("thread "+k+" is sleeping.10 seconds pls");
            thread4.sleep(10000);}
    }
}

class Runnable1 implements Runnable {

    private int[] arr;
    private int el;

    public Runnable1(int[] arr, int el) {
        this.arr = arr;
        this.el = el;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start < Main.time);
        int res = 0;
        for(int anArr : arr) {
            if(anArr == this.el) {
                res++;
                System.out.println("Yes");
            }

        }
        System.out.println(res + " Time of execution thread1: " + (System.currentTimeMillis() - start + Main.time) / 1000);
    }
}

class Runnable2 implements Runnable {

    private int[] arr;
    private int el;

    public Runnable2(int[] arr, int el) {
        this.arr = arr;
        this.el = el;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start < Main.time);
        int res = -1;
        for (int i = 0; i < 10; i++) {
            System.out.println("array "+arr[i]);
        }

        System.out.println(" Time of execution thread2: " + (System.currentTimeMillis() - start + Main.time));
    }
}

class Runnable3 implements Runnable {

    private int[] arr;

    public Runnable3(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {

        long start = System.currentTimeMillis();
        while(System.currentTimeMillis() - start < Main.time);
        int res = 0;
        for(int anArr : arr) {
            res += anArr;
        }
        System.out.println("Sum = " + res  + " Time of execution thread3: " + (System.currentTimeMillis() - start + Main.time) / 1000);
    }
}

class Runnable4 implements Runnable {

    private int[] arr;

    public Runnable4(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int max = 0, min = 0;
        long start = System.currentTimeMillis();
        int[] tmp=arr.clone();
        Arrays.sort(tmp);
        while(System.currentTimeMillis() - start < Main.time);
        for(int anArr : tmp) {
            if(anArr > max) {
                max = anArr;
            }
            if(anArr < min) {
                min = anArr;
            }
        }
        System.out.println("Max value - " + max + " Min value - " + min  + " Time of executionthread4: " + (System.currentTimeMillis() - start + Main.time));
    }
}
