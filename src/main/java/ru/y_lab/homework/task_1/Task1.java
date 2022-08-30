package ru.y_lab.homework.task_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.doTask();
    }

    public int makeRandomNumber(int x) {
        if (x % 2 == 0) {
            x = x + 3;
        } else if (x > 1000) {
            x = 100 + x % 13;
        }  else if (x < -1000) {
            x = x*x;
        } else if (x % 7 == 0) {
            x = x - 4;
        } else if (x % 5 == 0) {
            x = x - 18;
        } else if (x > 100) {
            x -= 20;
        } else if (x < 0) {
            x += 20;
        }
        return x;
    }

    public int findMin(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public double findAvg(int[][] arr) {
        int sum = 0;
        int amountOfNumbers = arr.length * arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return (sum * 1.0 / amountOfNumbers);
    }

    public int[][] madeArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Пожалуйста, введите кол-во строк: ");
        int strings = scanner.nextInt();
        System.out.println(" Пожалуйста, введите кол-во столбцов: ");
        int columns = scanner.nextInt();
        int[][] arr = new int[strings][columns];
        System.out.println(" Пожалуйста, введите случайное число: ");
        int number = scanner.nextInt();

        System.out.print("Получили массив: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = makeRandomNumber(number);
                number = number - (int) findAvg(arr);
                number = number + findMin(arr);
                number = number - findMax(arr);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
        }
        return arr;
    }

    public void doTask() {
        int[][] arr = madeArr();
        System.out.println("");
        System.out.println("Минимальное число в массиве: " + findMin(arr));
        System.out.println("Максимальное число в массиве: " + findMax(arr));
        System.out.println("Среднее значение чисел " + findAvg(arr));

    }


}
