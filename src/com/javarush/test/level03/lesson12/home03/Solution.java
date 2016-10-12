package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму:");
        String sum = scanner.nextLine();
        int nSum = Integer.parseInt(sum);

        System.out.print("Я буду зарабатывать $" + nSum + " в час");
    }
}