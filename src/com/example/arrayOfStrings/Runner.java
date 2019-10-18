package com.example.arrayOfStrings;

public class Runner {

    public static void main(String[] args) {
        int size = 3;
        try {
            MyArrayOfStrings a = new MyArrayOfStrings(size);
            a.randomMyArrayofStrings();//создаем массив строк
            System.out.println(a.toString());
            a.characterReplacement();//заменяем все неА на А
            System.out.println("массив после замены:");
            System.out.println(a.toString());
        } catch (NullPointerException e) {
            System.out.println("Массив не создан");
        }
    }
}
