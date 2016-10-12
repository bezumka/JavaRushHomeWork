package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
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
        int result = 0;
        for (int n : source)
        {
            if (n > 0) result++;
        }
        System.out.println(result);

    }
}
