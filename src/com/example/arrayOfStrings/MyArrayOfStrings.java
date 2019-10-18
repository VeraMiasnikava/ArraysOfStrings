package com.example.arrayOfStrings;

import java.util.Random;

class MyArrayOfStrings {
    private String[] a;
    private int size;
    private Random random = new Random();


    MyArrayOfStrings(int size) {
        try {
            this.size = size;
            if (size < 1) {
                throw new MyArrayException("неверный размер массива!");
            }
            a = new String[size];
        } catch (MyArrayException e) {
            System.out.println(e.getMessage());
        }

    }

    void randomMyArrayofStrings() {
        //метод заполняет массив случайным количеством строк,
        //заполненных случайными символами
        int x, length;
        char y;
        for (int i = 0; i < size; i++) {
            StringBuilder t = new StringBuilder("");//создаем очередную строку, которую будем записывать в массив
            length = 10 + random.nextInt(20);//генерируем длину очередной строки массива
            for (int j = 0; j < length; j++) {
                x = random.nextInt(26) + 65;//генерируем случайное число - код очередного символа
                y = (char) x;//преобразуем код в символ
                t.append(y);//присоединяем очередной символ к строке
            }
            a[i] = t.toString();//заносим полученную строку в массив
        }

    }

    void characterReplacement() {
        //заменяем все не А символы на А
        for (int i = 0; i < size; i++) {
            a[i] = a[i].replaceAll("[^A]", "A");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(String.format("Массив:%n"));
        for (String element : a) {
            s.append(element).append(String.format("%n"));
        }
        return s.toString();
    }
}
