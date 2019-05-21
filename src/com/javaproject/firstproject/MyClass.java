package com.javaproject.firstproject;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        int i = 10;
        double d = 1.5;

        //int i1 = 1.5;
        int i2 = (int) 1.5;

        //long l = 2.5;
        double d2 = 10;

        byte b = (byte) 2000000;

        int i3 = 20 / 30;
        double i4 = 20.0 / 30.0;

        System.out.println(i2);
        System.out.println(d2);
        System.out.println(b);
        System.out.println(i3);
        System.out.println(i4);


        System.out.println("------------------");

        String s1 = "abc";
        String s2 = new String("abcd");

        System.out.println(s1 + " : " + s2);
        System.out.println("abc" + " : " + "abcd");

        int intVar;
        Integer intVar1;

        List<Integer> list;


        String str = "0";
        for (int j = 0; j < 100; j++) {
            str += j;
            System.out.println(str);
        }
        System.out.println(str);


        int j1;
        j1 = 10;

        int[] arrayInt = new int[5];
        arrayInt[0] = -1;
        arrayInt[1] = 2;
        arrayInt[2] = 7;
        arrayInt[3] = 1;
        arrayInt[4] = 6;
        //arrayInt[5]=7;


        System.out.println(arrayInt);
        System.out.println(Arrays.toString(arrayInt));

        for (int j = 0; j < arrayInt.length; j++) {
            System.out.println(arrayInt[j]);
        }

        for (int i1 : arrayInt) {
            System.out.println(i1);
        }

        Scanner scanner = new Scanner(System.in);
        String strVar1 = scanner.nextLine();
        System.out.println("You entered:" + strVar1);


        int[] numbers = new int[10];
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = j * j;
            numbers[j] = (int) Math.pow(j, 2);
        }

        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }

        findP();

        printName("Java");

        int s = sum(5,6);

    }

    public static int sum(int a, int b) {
        int resultSum;
        resultSum = a + b;
        return resultSum;
    }

    public static void printName(String name) {
        System.out.println("Your name is " + name);
    }


    public static void findP() {
        String searchMe = "peter piper picked a " +
                "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) == 'p') {
                numPs++;
            }
        }
        //print number of "p"
        System.out.println(numPs);

    }
}
