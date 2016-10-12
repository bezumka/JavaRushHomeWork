package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence:\t");
        String name = scanner.nextLine();
        System.out.print("Enter a sentence1:\t");
        String name1 = scanner.nextLine();
        System.out.print("Enter a sentence2:\t");
        String name2 = scanner.nextLine();
        System.out.print(name + " + " + name1 + " + " + name2 + " = Чистая любовь, да-да!");
    }
}