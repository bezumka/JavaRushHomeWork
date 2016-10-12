package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число 1");
        String number1 = scanner.nextLine();
        int a = Integer.parseInt(number1);

        System.out.println("Введите число 2");
        String number2 = scanner.nextLine();
        int b = Integer.parseInt(number2);

        System.out.println("Введите число 3");
        String number3 = scanner.nextLine();
        int c = Integer.parseInt(number3);

        System.out.println("Введите число 4");
        String number4 = scanner.nextLine();
        int d = Integer.parseInt(number4);

        System.out.println( max(a, b, c, d) );
    }

    private static int max(int a, int b, int c, int d)
    {
        int max2;
        if (max(a, b) > max(c, d))
            max2 = max(a, b);
        else
            max2 = max(c, d);
        return max2;
    }

    private static int max(int a, int b)
    {
        int max1;
        if (a > b)
            max1 = a;
        else
            max1 = b;
        return max1;
    }
}
