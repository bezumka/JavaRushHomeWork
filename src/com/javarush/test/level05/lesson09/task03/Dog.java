package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    private String name = null;
    private String weight = null;
    private String color  = null;

    public Dog(String name)
    {
        this.name = name;
    }

    public Dog(String weight, String name)
    {
        this.name = name;
        this.weight = weight;
    }

    public Dog(String name, String weight, String color)
    {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
}
