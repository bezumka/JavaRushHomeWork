package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    private String name = null;
    private String age = null;
    private String gender  = null;

    public Friend(String name)
    {
        this.name = name;
    }

    public Friend(String name, String age)
    {
        this.name = name;
        this.age = age;
    }

    public Friend(String name, String age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}