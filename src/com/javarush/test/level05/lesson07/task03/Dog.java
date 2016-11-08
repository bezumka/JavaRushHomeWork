package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
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

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public void initialize(String name, String weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }
}
