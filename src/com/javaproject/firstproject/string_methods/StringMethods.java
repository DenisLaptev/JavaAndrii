package com.javaproject.firstproject.string_methods;

public class StringMethods {

    public static void main(String[] args) {
        String text = "aaaaaaaaaaaaaa. bbbbbbbbbbbbb. eeeeeeeeeeeeeeee.cc.ffffff.";
        String[] strArray = text.split("\\.");

        System.out.println(text);
        System.out.println("---------------------");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("Element number" + i + ":" + strArray[i]);
        }


        char[] letters = strArray[0].toCharArray();
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
            if(letters[i]=='a'){
                count++;
            }
        }
        System.out.println("word "+strArray[0]+" contains "+ count + " letters 'a'!");

    }
}
