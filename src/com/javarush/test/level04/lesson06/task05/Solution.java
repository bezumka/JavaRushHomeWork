package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
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

        if (number < 18){
            System.out.println("Подрасти еще");
        }
    }
}
