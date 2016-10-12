package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону А: ");
        String triangle_side1 = scanner.nextLine();
        int a = Integer.parseInt(triangle_side1);

        System.out.println("Введите сторону В: ");
        String triangle_side2 = scanner.nextLine();
        int b = Integer.parseInt(triangle_side2);

        System.out.println("Введите сторону В: ");
        String triangle_side3 = scanner.nextLine();
        int c = Integer.parseInt(triangle_side3);

        if (a < b + c && b < a + c && c < a + b){
            System.out.println("Треугольник существует.");
        }else{
            System.out.println("Треугольник не существует.");
        }
    }
}