package com.example.strings;

import java.util.Random;

class MyArrayOfStrings {
    private String[] a;
    private int size;
    private Random random = new Random();


    MyArrayOfStrings(int size) {
        try {
            this.size = size;
           if (size < 1) {
                throw new InvalidArraySizeException("неверный размер массива!");
            }
            a = new String[size];
        } catch (InvalidArraySizeException e) {
            System.out.println(e.getMessage());
        }

    }

    void randomMyArrayOfStrings() {
        int characterСode, length=0;
        char symbol;
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < size; i++) {
            t.delete(0, t.length());
            length = 10 + random.nextInt(20);
            for (int j = 0; j < length; j++) {
                characterСode = random.nextInt(26) + 65;
                symbol = (char) characterСode;
                t.append(symbol);
            }
            a[i] = t.toString();
        }

    }

    void characterReplacement() {
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
