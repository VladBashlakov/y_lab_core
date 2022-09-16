package ru.y_lab.homework_2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {
/*
        Task3
            Реализовать функцию нечеткого поиска

                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */

    public static void main(String[] args) {

        fuzzySearch("car", "ca6$$#_rtwheel"); // true
        fuzzySearch("cwhl", "cartwheel"); // true
        fuzzySearch("cwhee", "cartwheel"); // true
        fuzzySearch("cartwheel", "cartwheel"); // true
        fuzzySearch("cwheeel", "cartwheel"); // false
        fuzzySearch("lw", "cartwheel"); // false

    }


    public static void fuzzySearch(String firstStr, String secondStr) {

        char[] firstStrArr = new char[0];
        char[] secondStrArr = new char[0];
        char[] findText = new char[0];

        if (firstStr != null && secondStr != null) {
            firstStrArr = firstStr.toCharArray();
            secondStrArr = secondStr.toCharArray();
            findText = new char[firstStr.length()];
        } else {
            System.out.println("Проверьте ввод");
        }

        int index = 0;

        for (int i = 0; i < firstStrArr.length; i++) {
            for (int i1 = index; i1 < secondStrArr.length; i1++) {
                if (firstStrArr[i] == secondStrArr[i1]) {
                    index = i1 + 1;
                    findText[i] = secondStrArr[i1];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(findText).equals(Arrays.toString(firstStrArr)));
    }


}
