package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat TomCat = new Cat("Tom", 12, "grey", 12);
        Dog NameDoge = new Dog("Dog", 12, 24, "black");
        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name)
        {
            this.name = name;
        }

        public Mouse(String name, int height)
        {
            this.name = name;
            this.height = height;
        }


        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog{
        String name;
        int height;
        int weight;
        String color;

        public Dog(String name)
        {
            this.name = name;
        }

        public Dog(String name, int height)
        {
            this.name = name;
            this.height = height;
        }

        public Dog(String name, int height, int weight)
        {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public Dog(String name, int height, int weight, String color)
        {
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.color = color;
        }
    }

    public static class Cat{
        String name;
        int height;
        String color;
        int paws;

        public Cat(String name)
        {
            this.name = name;
        }

        public Cat(String name, int height)
        {
            this.name = name;
            this.height = height;
        }

        public Cat(String name, int height, String color)
        {
            this.name = name;
            this.height = height;
            this.color = color;
        }

        public Cat(String name, int height, String color, int paws)
        {
            this.name = name;
            this.height = height;
            this.color = color;
            this.paws = paws;
        }
    }
    //добавьте тут ваши классы

}
