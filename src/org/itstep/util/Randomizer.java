package org.itstep.util;

import java.util.Random;

public class Randomizer {
    public static int getRandomNumber(int from, int to) {
        Integer number = from + (new Random().nextInt(to - from));

        return number;
    }

    public static String getRandomString(int lenght) {
        String text = "";

        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] symbols = alphabet.toCharArray();

        for (int i = 0; i < lenght; i++) {
            text += symbols[getRandomNumber(0, symbols.length - 1)];

        }


        return text;

    }

}
