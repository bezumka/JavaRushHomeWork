package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[5];
        for (int i = 0; i <= 4; i++)
        {
            mas[i] = Integer.parseInt(reader.readLine());
        }
        int min = mas[0];
        for (int i = 1; i <= 4; i++){
            if(mas[i]<min) min = mas[i];
        }
        System.out.println("Minimum = " + min);
    }
}
