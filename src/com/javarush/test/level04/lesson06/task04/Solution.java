package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя 1");
        String name1 = scanner.nextLine();

        System.out.println("Введите имя 2");
        String name2 = scanner.nextLine();

        String a = name1;
        String b = name2;

        if (a.equals(b)){
            System.out.println("Имена идентичны");
        }else if (a.length() == b.length()){
            System.out.println("Длины имен равны");
        }else{
            System.out.println("Данное условие не заложено программой");
        }
    }
}
