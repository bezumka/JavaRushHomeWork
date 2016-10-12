package com.javarush.test.level04.lesson16.home04;


import java.util.Scanner;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        String birthday_year = scanner.nextLine();
        int a = Integer.parseInt(birthday_year);

        String birthday_month = scanner.nextLine();
        int b = Integer.parseInt(birthday_month);

        String birthday_day = scanner.nextLine();
        int c = Integer.parseInt(birthday_day);

        System.out.println("Меня зовут" + " " + name);
        System.out.print("Я родился" + " " + c + "." + b + "." + a);
    }
}
