package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Число А: ");
        String number1 = scanner.nextLine();
        int a = Integer.parseInt(number1);

        System.out.println("Введите Число В: ");
        String number2 = scanner.nextLine();
        int b = Integer.parseInt(number2);

        System.out.println("Введите Число С: ");
        String number3 = scanner.nextLine();
        int c = Integer.parseInt(number3);

        if ((a != c) && (a == b)){
            System.out.println(a + " " + b);
        }else if ((b != a) && (b == c)){
            System.out.println(b + " " + c);
        }else if ((a != b) && (a == c)){
            System.out.println(a + " " + c);
        }else if (a == b && c == a){
            System.out.println(a + " " + b + " " + c);
        }
    }
}