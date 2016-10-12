package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /* напишите тут ваш код */
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String amount = scanner.nextLine();
        int nAmount = Integer.parseInt(amount);

        String age = scanner.nextLine();
        int nAge = Integer.parseInt(age);
        System.out.print(name + " получает " + nAmount + " через " + nAge + " лет.");
    }
}