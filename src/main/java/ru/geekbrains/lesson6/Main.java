package ru.geekbrains.lesson6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Барс");
        Cat cat = new Cat("Кошка", "Черная");
        Dog dog = new Dog("Пес");
        animal.animalInfo();
        cat.catInfo();
        dog.dogInfo();

        cat.run(50);
        dog.run(900);
        cat.swim(20);
        dog.swim(100);




    }
}
