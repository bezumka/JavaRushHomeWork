package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] mas = new int[3];
        for(int i = 0; i <= mas.length - 1; i++)
            mas[i] = Integer.parseInt(input.readLine());

        for(int i = 0; i <= mas.length - 1; i++) {
            int count = 0;
            for(int j = 0; j <= mas.length - 1; j++) {
                if ((mas[i] != mas[j])) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}

