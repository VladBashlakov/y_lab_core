package ru.y_lab.homework_2;

public class Task_2 {
       /*
        Task2

            [3, 4, 2, 7], 10 -> [3, 7] - вывести пару именно в скобках, которые дают сумму - 10
         */


    public static void main(String[] args) {

        int[] arr = {3, 4, 2, 7};
        findPairWithSumTen(arr);


    }

    public static void findPairWithSumTen(int[] arr) {

        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                for (int i1 = i + 1; i1 < arr.length; i1++) {
                    if (arr[i1] + arr[i] == 10) {
                        System.out.println("[" + arr[i] + ", " + arr[i1] + "]");
                        i = arr.length - 1;
                    }
                }
            }
        } else {
            System.out.println("Проверьте ввод");
        }
    }
    }

