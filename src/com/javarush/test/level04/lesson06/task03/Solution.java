package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        int[] n = {a, b, c};
        for (int i = 0; i<n.length; i++){
            for (int j = 0; j < n.length; j ++){
                if (n[i] > n[j]){
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        for (int nu : n){
            System.out.print(nu + " ");
        }
    }
}
