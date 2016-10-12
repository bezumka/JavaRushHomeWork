package com.javarush.test.level03.lesson04.task05;

/* Сумма 10 чисел
Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
1
1+2=3
1+2+3=6
1+2+3+4=10
...
Пример вывода:
1
3
6
10
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        int[] m = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x = 0; x < 10; x++)
        {
            sum += m[x];
            System.out.println(sum);
        }
    }
}