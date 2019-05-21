package com.javaproject.firstproject;

import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("nextLine(): ");
        String strNextLine = in.nextLine();
        int intVar = Integer.parseInt(strNextLine);
        System.out.println("intVar+1=" + (intVar+1));


/*
        System.out.print("next(): ");
        String strNext = in.next();
        System.out.println("strNext=" + strNext);

        System.out.print("nextInt(): ");
        int nextInt = in.nextInt();
        System.out.println("nextInt=" + nextInt);

        System.out.print("nextDouble(): ");
        double nextDouble = in.nextDouble();
        System.out.println("nextDouble=" + nextDouble);
        */

    }
}
