package ru.geekbrains.lesson6;

public class Animal {
   protected String name;
      public Animal(){
      }

   public Animal(String name) {
       this.name=name;

   }

   public void animalInfo() {
       System.out.println("Животное зовут " +name);
   }
   public void run(int distance) {
       System.out.println("Животное пробежало " + distance +" метров");
   }
   public void swim(int distance) {
       System.out.println("Животное проплыло " + distance + " метров");
   }


}
