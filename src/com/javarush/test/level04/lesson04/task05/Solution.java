package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int nNumber = Integer.parseInt(number);

        if (nNumber < 0){
            nNumber = nNumber + 1;
        }else{
            nNumber = nNumber * 2;
        }
        System.out.println("Ваш конечный результат: " + nNumber);
    }
}