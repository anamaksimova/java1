package ru.geekbrains.lesson6;

public class Cat extends Animal {
    private String color;
    public Cat (String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void catInfo(){
        System.out.println("Имя кота: " + name + " \n Цвет кота: "+color);
    }

    @Override
    public void run(int distance) {
        if (distance<200) {

            System.out.println("Кот пробежал " + distance + " метров");
        } else System.out.println("Кот столько не бегает " + distance + " метров - это слишком много");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не плавают");

    }
}
