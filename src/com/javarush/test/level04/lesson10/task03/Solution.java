package com.javarush.test.level04.lesson10.task03;

import java.io.*;
import java.util.Scanner;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String number = scanner.nextLine();
        int a = Integer.parseInt(number);

        int i = 0;
        while (i < a)
        {
            System.out.println(text);
            i++;
        }
    }
}
