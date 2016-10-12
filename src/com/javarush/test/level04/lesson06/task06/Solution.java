package com.javarush.test.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Введите имя");
        String name = scanner.nextLine();

        //System.out.println("Введите возраст");
        String n = scanner.nextLine();
        int number = Integer.parseInt(n);

        if (number > 20)
        {
            System.out.println("И 18-ти достаточно");
        }
    }
}
