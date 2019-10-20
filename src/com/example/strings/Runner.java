package com.example.strings;

public class Runner {
    static final int SIZE = 3;

    public static void main(String[] args) {
        try {
            MyArrayOfStrings a = new MyArrayOfStrings(SIZE);
            a.randomMyArrayOfStrings();
            System.out.println(a.toString());
            a.characterReplacement();
            System.out.println(String.format("массив после замены:%n") + a.toString());
        } catch (NullPointerException e) {
            System.out.println("Массив не создан");
        }
    }
}
