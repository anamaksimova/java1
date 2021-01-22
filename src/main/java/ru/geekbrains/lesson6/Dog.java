package ru.geekbrains.lesson6;

public class Dog extends Animal {
    public Dog (String name) {
        this.name=name;
    }
    public void dogInfo(){
        System.out.println("Имя собаки: " + name);
    }

    @Override
    public void run(int distance) {
        if (distance<500) {
            System.out.println("Собака пробежала " + distance + " метров");
        } else {
            System.out.println("Собака не может столько бегать "+ distance + " метров - это слишком много");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance<=10) {
            System.out.println("Собака проплыла " + distance + " метров");
        } else  {
            System.out.println("Собака не может столько проплыть. " + distance + " метров - это слишком много");
        }
    }
}
