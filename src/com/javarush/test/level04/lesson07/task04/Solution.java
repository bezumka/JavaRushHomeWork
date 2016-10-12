package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Введите число 1");
        String number1 = scanner.nextLine();
        int a = Integer.parseInt(number1);

        //System.out.println("Введите число 2");
        String number2 = scanner.nextLine();
        int b = Integer.parseInt(number2);

        //System.out.println("Введите число 3");
        String number3 = scanner.nextLine();
        int c = Integer.parseInt(number3);

        int[] source = {a, b, c};
        int positive = 0;
        int negative = 0;

        for (int n : source)
        {
            if (n >= 0){
                positive++;
            } else if (n < 0){
                negative++;
            }
        }

        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество положительных чисел: " + positive);
    }
}
